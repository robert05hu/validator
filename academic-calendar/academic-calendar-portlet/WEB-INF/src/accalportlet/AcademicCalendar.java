package accalportlet;

import calportlet.model.Event;
import calportlet.service.EventLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.mysql.fabric.xmlrpc.base.Param;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class AcademicCalendar
 */
public class AcademicCalendar extends MVCPortlet {
 
	/**
	 * Adds a new event to the database
	 * 
	 */
	public void addEvent(ActionRequest request, ActionResponse response) throws Exception{
				
		Event event = EventLocalServiceUtil.createEvent(0);
		
		event.setEventId(ParamUtil.getLong(request, "eventId"));
		event.setName_hu(ParamUtil.getString(request, "name_hu"));
		event.setName_en(ParamUtil.getString(request, "name_en"));
		event.setTvsz(ParamUtil.getString(request, "tvsz"));
		
		/* implemented select from aui:select */
		String type = ParamUtil.getString(request, "selection");
		event.setTypeofEvent(Integer.parseInt(type));
		
		/* setting up the date */
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date eventDate = null;
		String eventDateString=ParamUtil.getString(request,"select-date");
		
		try {
			
			eventDate = dateFormat.parse(eventDateString);
			
		} catch (Exception e) {
			
			eventDate = null;
			
		}

		
		event.setEventDate(eventDate);
		
		List<String> errors = new ArrayList<String>();

		if (AcademicCalendarValidator.validate(event, errors)) {
			EventLocalServiceUtil.addEvent(event);

			SessionMessages.add(request, "event-added");

			sendRedirect(request, response);
		}
		else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("mvcPath", "/html/academiccalendar/edit_event.jsp");
		}
	}
		
	/**
	 * Updates the database record of an existing event.
	 *
	 */
	public void updateEvent(ActionRequest request, ActionResponse response)
		throws Exception {

		long eventId = ParamUtil.getLong(request, "eventId");
		Event event = null;
		
		try {
			event = EventLocalServiceUtil.fetchEvent(eventId);
		} catch (SystemException se) {
			_log.error(se);
			return;
		}

		event.setEventId(ParamUtil.getLong(request, "eventId"));
		event.setName_hu(ParamUtil.getString(request, "name_hu"));
		event.setName_en(ParamUtil.getString(request, "name_en"));
		event.setTvsz(ParamUtil.getString(request, "tvsz"));
		
		/* implemented select from aui:select */
		String type = ParamUtil.getString(request, "selection");
		event.setTypeofEvent(Integer.parseInt(type));
		
		/*
		int eventDateMonth = ParamUtil.getInteger(request, "orderDateMonth");
		int eventDateDay = ParamUtil.getInteger(request, "orderDateDay");
		int eventDateYear = ParamUtil.getInteger(request, "orderDateYear");
		Date eventDate = PortalUtil.getDate(eventDateMonth, eventDateDay,
			eventDateYear);*/
		
		/* dont set the date, if date is NULL */
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				
		if( !(ParamUtil.getString(request,"select-date").isEmpty()) ){
			
			event.setEventDate(dateFormat.parse(
					ParamUtil.getString(request,"select-date")));
			
		}
		
		List<String> errors = new ArrayList<String>();

		if (AcademicCalendarValidator.validate(event, errors)) {
			EventLocalServiceUtil.updateEvent(event);

			SessionMessages.add(request, "event-added");

			sendRedirect(request, response);
		}
		else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			PortalUtil.copyRequestParameters(request, response);

			response.setRenderParameter("mvcPath", "/html/academiccalendar/edit_event.jsp");
		}
	}

	/**
	 * Deletes an event from the database.
	 *
	 */
	public void deleteEvent(ActionRequest request, ActionResponse response)
		throws Exception {

		long eventId = ParamUtil.getLong(request, "eventId");

		if (Validator.isNotNull(eventId)) {
			EventLocalServiceUtil.deleteEvent(eventId);

			SessionMessages.add(request, "event-deleted");

			sendRedirect(request, response);
		}
		
		else {
			SessionErrors.add(request, "null-event-error");
			sendRedirect(request, response);
		}
	}
		
	/* IDK yet */
	public int checkBoxAllEvent(ActionRequest actionRequest ,ActionResponse actionResponse) throws SystemException{
		//Works just as Expected
		 boolean  viewChecked = ParamUtil.getBoolean(actionRequest, "allevent");
		
		 if(!viewChecked)
			 return EventLocalServiceUtil.getEventsByToday(0);
		 else
			 return 0;
		 
	}
	
	private static Log _log = LogFactoryUtil.getLog(AcademicCalendar.class);
}
