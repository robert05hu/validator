/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package calportlet.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import calportlet.model.Event;
import calportlet.service.EventLocalServiceUtil;
import calportlet.service.base.EventLocalServiceBaseImpl;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link calportlet.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author robert
 * @see calportlet.service.base.EventLocalServiceBaseImpl
 * @see calportlet.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link calportlet.service.EventLocalServiceUtil} to access the event local service.
	 */
	
	/**
	 * Adds the Event to the database incrementing the primary key
	 *
	 */

	public Event addEvent(Event event) throws SystemException {
		
		//add eventId with a counter
		long eventId = counterLocalService.increment(Event.class.getName());
		
		event.setEventId(eventId);
		
		return super.addEvent(event);
		
	}
	
	
	/**
	 * Gets a list with all the Events by date
	 *
	 */
	public List<Event> getEventsByDate(Date eventDate) throws SystemException {
		
		return eventPersistence.findByEventDate(eventDate);
		
	}
	
	/*
	 * Gets a list with range of Events from a group by name_en
	 * 
	 * */
	
	public List<Event> getEventsByDate(Date eventDate, int start, int end) throws SystemException {
		
		return eventPersistence.findByEventDate(eventDate, start, end);
		
	}
	
	/*
	 * 
	 * Gets a list with all Events by name_en
	 * 
	 * */
	
	public List<Event> getEventsByNameEn(String name_en) throws SystemException {
		
		return eventPersistence.findByName_en(name_en);
		
	}
	/*
	 * Gets a list with range of Events from a group by name_en
	 * 
	 * */
	
	public List<Event> getEventsByNameEn(String name_en, int start, int end) throws SystemException {
		
		return eventPersistence.findByName_en(name_en, start, end);
		
	}
	/*
	 * 
	 * Gets a list with all Events by name_hu
	 * 
	 * */
	
	public List<Event> getEventsByNameHu(String name_hu) throws SystemException {
		
		return eventPersistence.findByName_hu(name_hu);
		
	}
	
	/*
	 * Gets a list with range of Events from a group by name_hu
	 * 
	 * */
	
	public List<Event> getEventsByNameHu(String name_hu, int start, int end) throws SystemException {
		
		return eventPersistence.findByName_hu(name_hu, start, end);
		
	}
	
	/*
	 * Gets a list by type of events without range
	 * 
	 * */
	public List<Event> getEventsBytype(long typeofEvent) throws SystemException{
		
		return eventPersistence.findByTypeofEvent(typeofEvent);
		
	}
	
	/*
	 * Gets a list by type of events with a range
	 *
	 * */
	
	public List<Event> getEventsBytype(long typeofEvent, int start, int end) throws SystemException{
		
		return eventPersistence.findByTypeofEvent(typeofEvent, start, end);
	
	}
	
	/*gets a list with all events without a range */
	public List<Event> getEventsByAll() throws SystemException{
		
		return eventPersistence.findAll();
		
	}

	/*gets a list with all events with a range */
	public List<Event> getEventsByAll(int start, int end) throws SystemException{
		
		return eventPersistence.findAll(start, end);
		
	}

		/*unimplemented methods, please remove it after a service build */
	@Override
	public List<Event> getEventsByName(String name) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventsByName(String name, int start, int end)
			throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEventsCountAll() throws SystemException {
		// TODO Auto-generated method stub
		return eventPersistence.countAll();
	}

	@Override
	public int getEventsCountBy(Date eventDate) throws SystemException {
		// TODO Auto-generated method stub
		return eventPersistence.countByEventDate(eventDate);
	}

	public int getEventsCountByType(long typeofEvent) throws SystemException {
		
		return eventPersistence.countByTypeofEvent(typeofEvent);
	}
	
	/* 
	 * get the index of a first occurance an event, which's a date after today
	 * 
	 * */
	public int getEventsByToday(long typeofEvent) throws SystemException{
		
		List<Event> list = EventLocalServiceUtil.getEventsBytype(typeofEvent);
		int count = 0;
		
		for(Event e : list){
			count++;
			if( (e.getEventDate().compareTo(new Date(System.currentTimeMillis()-24*60*60*1000)))>=0 )
				break;
		}
		
		return count;
		
	}
	
	
}

