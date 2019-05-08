package com.cg.event.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import javax.swing.text.DateFormatter;

import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;

public class DBUtil
{
	public static List<Event> eventList=new ArrayList<Event>();
	public static List<Delegate> delegateList=new ArrayList<Delegate>();
	static 
	{
		SimpleDateFormat dt=new  SimpleDateFormat("dd/MM/yyyy");
		Event e=null,eone=null;
		Event ethree=null;
		try {
			e=new Event("talk show",dt.parse("21/10/2019"),"mumbai");
		   eone=new Event("comedy show",dt.parse("23/11/2020"),"hyderabad");
			ethree = new Event("concert",dt.parse("30/12/2019"),"delhi");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		eventList.add(e);
		eventList.add(eone);
		eventList.add(ethree);		
	}
}
