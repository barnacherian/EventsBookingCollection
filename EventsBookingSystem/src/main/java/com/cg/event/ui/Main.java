package com.cg.event.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.cg.event.dao.EventRepository;
import com.cg.event.dto.Address;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import com.cg.event.service.DelegateService;
import com.cg.event.service.DelegateServiceImpl;
import com.cg.event.util.DBUtil;

public class Main {

	public static void main(String[] args) throws DelegateException
	{		
		Scanner sc=new Scanner(System.in);
		DelegateService service=new DelegateServiceImpl();
		List<Event> eve=service.showEvents();  
		System.out.println("The events available are: ");	
		System.out.println(eve);								//displaying dummy events
				
		Address a= new Address("Galaxy Apt","MG marg","mumbai");   //adding address
		Address aone= new Address("telegraph building"," infy road ","Hyderabad");
		Address atwo= new Address("Unit 5","talwade","Pune");
		
		List<Event> eventList= service.showEvents();
		List<Event> delegateEvents= new ArrayList<Event>();
		List<Event> delegateEventsOne= new ArrayList<Event>();
		
		Delegate d=new Delegate("shailendra",aone,eventList);
		delegateEvents.add(eventList.get(0));
		
		Delegate d1=new Delegate("barna",a,delegateEvents);
		delegateEventsOne.add(eventList.get(0));
		delegateEventsOne.add(eventList.get(1));
		Delegate d2=new Delegate("vishnu",atwo,delegateEventsOne);
		
		service.registerDelegate(d);            	    //registering or adding delegates
		service.registerDelegate(d1);
		service.registerDelegate(d2);
		
		System.out.println("\nThe registered delegates are:");
		List<Delegate> delegates =service.showDelegates();
		System.out.println(delegates);				 	//showing delegates
		
		Event infoone =service.eventInfo(eventList.get(0));
		System.out.println("\nThe information for the selected event is as follows");
		System.out.println(infoone);           			//displaying event info
	}
}
