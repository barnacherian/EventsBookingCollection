package com.cg.event.service;
import java.util.List;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
public interface DelegateService{
	Delegate registerDelegate (Delegate delegate);
	List<Event>showEvents();	
	List<Delegate> showDelegates();
	Event eventInfo(Event event) throws DelegateException;
}
