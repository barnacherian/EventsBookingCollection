package com.cg.event.dao;

import java.util.List;

import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;

public interface EventRepository
{
	boolean save(Delegate name);
	List<Event> showAllEvents();
	List<Delegate> showAllDelegates();
}


