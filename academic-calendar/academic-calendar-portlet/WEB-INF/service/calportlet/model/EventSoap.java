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

package calportlet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link calportlet.service.http.EventServiceSoap}.
 *
 * @author robert
 * @see calportlet.service.http.EventServiceSoap
 * @generated
 */
public class EventSoap implements Serializable {
	public static EventSoap toSoapModel(Event model) {
		EventSoap soapModel = new EventSoap();

		soapModel.setEventId(model.getEventId());
		soapModel.setName_hu(model.getName_hu());
		soapModel.setName_en(model.getName_en());
		soapModel.setEventDate(model.getEventDate());
		soapModel.setTvsz(model.getTvsz());
		soapModel.setTypeofEvent(model.getTypeofEvent());

		return soapModel;
	}

	public static EventSoap[] toSoapModels(Event[] models) {
		EventSoap[] soapModels = new EventSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EventSoap[][] toSoapModels(Event[][] models) {
		EventSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EventSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EventSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EventSoap[] toSoapModels(List<Event> models) {
		List<EventSoap> soapModels = new ArrayList<EventSoap>(models.size());

		for (Event model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EventSoap[soapModels.size()]);
	}

	public EventSoap() {
	}

	public long getPrimaryKey() {
		return _eventId;
	}

	public void setPrimaryKey(long pk) {
		setEventId(pk);
	}

	public long getEventId() {
		return _eventId;
	}

	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	public String getName_hu() {
		return _name_hu;
	}

	public void setName_hu(String name_hu) {
		_name_hu = name_hu;
	}

	public String getName_en() {
		return _name_en;
	}

	public void setName_en(String name_en) {
		_name_en = name_en;
	}

	public Date getEventDate() {
		return _eventDate;
	}

	public void setEventDate(Date eventDate) {
		_eventDate = eventDate;
	}

	public String getTvsz() {
		return _tvsz;
	}

	public void setTvsz(String tvsz) {
		_tvsz = tvsz;
	}

	public long getTypeofEvent() {
		return _typeofEvent;
	}

	public void setTypeofEvent(long typeofEvent) {
		_typeofEvent = typeofEvent;
	}

	private long _eventId;
	private String _name_hu;
	private String _name_en;
	private Date _eventDate;
	private String _tvsz;
	private long _typeofEvent;
}