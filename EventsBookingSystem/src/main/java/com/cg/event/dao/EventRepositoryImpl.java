package com.cg.event.dao;
import com.cg.event.dto.Event;
import com.cg.event.util.DBUtil;
import com.cg.event.dto.Delegate;
import java.util.ArrayList;
import java.util.List;
import com.cg.event.dto.Delegate;

public class EventRepositoryImpl implements EventRepository {
	
	public boolean save(Delegate delegate) {		
		DBUtil.delegateList.add(delegate);				
		return true;
	}	 
	public List<Event> showAllEvents() {		
		return DBUtil.eventList;
	}
	public List<Delegate> showAllDelegates() {
		return DBUtil.delegateList;
	}

}
