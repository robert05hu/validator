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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Event}.
 * </p>
 *
 * @author robert
 * @see Event
 * @generated
 */
public class EventWrapper implements Event, ModelWrapper<Event> {
	public EventWrapper(Event event) {
		_event = event;
	}

	@Override
	public Class<?> getModelClass() {
		return Event.class;
	}

	@Override
	public String getModelClassName() {
		return Event.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("name_hu", getName_hu());
		attributes.put("name_en", getName_en());
		attributes.put("eventDate", getEventDate());
		attributes.put("tvsz", getTvsz());
		attributes.put("typeofEvent", getTypeofEvent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String name_hu = (String)attributes.get("name_hu");

		if (name_hu != null) {
			setName_hu(name_hu);
		}

		String name_en = (String)attributes.get("name_en");

		if (name_en != null) {
			setName_en(name_en);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		String tvsz = (String)attributes.get("tvsz");

		if (tvsz != null) {
			setTvsz(tvsz);
		}

		Long typeofEvent = (Long)attributes.get("typeofEvent");

		if (typeofEvent != null) {
			setTypeofEvent(typeofEvent);
		}
	}

	/**
	* Returns the primary key of this event.
	*
	* @return the primary key of this event
	*/
	@Override
	public long getPrimaryKey() {
		return _event.getPrimaryKey();
	}

	/**
	* Sets the primary key of this event.
	*
	* @param primaryKey the primary key of this event
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_event.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the event ID of this event.
	*
	* @return the event ID of this event
	*/
	@Override
	public long getEventId() {
		return _event.getEventId();
	}

	/**
	* Sets the event ID of this event.
	*
	* @param eventId the event ID of this event
	*/
	@Override
	public void setEventId(long eventId) {
		_event.setEventId(eventId);
	}

	/**
	* Returns the name_hu of this event.
	*
	* @return the name_hu of this event
	*/
	@Override
	public java.lang.String getName_hu() {
		return _event.getName_hu();
	}

	/**
	* Sets the name_hu of this event.
	*
	* @param name_hu the name_hu of this event
	*/
	@Override
	public void setName_hu(java.lang.String name_hu) {
		_event.setName_hu(name_hu);
	}

	/**
	* Returns the name_en of this event.
	*
	* @return the name_en of this event
	*/
	@Override
	public java.lang.String getName_en() {
		return _event.getName_en();
	}

	/**
	* Sets the name_en of this event.
	*
	* @param name_en the name_en of this event
	*/
	@Override
	public void setName_en(java.lang.String name_en) {
		_event.setName_en(name_en);
	}

	/**
	* Returns the event date of this event.
	*
	* @return the event date of this event
	*/
	@Override
	public java.util.Date getEventDate() {
		return _event.getEventDate();
	}

	/**
	* Sets the event date of this event.
	*
	* @param eventDate the event date of this event
	*/
	@Override
	public void setEventDate(java.util.Date eventDate) {
		_event.setEventDate(eventDate);
	}

	/**
	* Returns the tvsz of this event.
	*
	* @return the tvsz of this event
	*/
	@Override
	public java.lang.String getTvsz() {
		return _event.getTvsz();
	}

	/**
	* Sets the tvsz of this event.
	*
	* @param tvsz the tvsz of this event
	*/
	@Override
	public void setTvsz(java.lang.String tvsz) {
		_event.setTvsz(tvsz);
	}

	/**
	* Returns the typeof event of this event.
	*
	* @return the typeof event of this event
	*/
	@Override
	public long getTypeofEvent() {
		return _event.getTypeofEvent();
	}

	/**
	* Sets the typeof event of this event.
	*
	* @param typeofEvent the typeof event of this event
	*/
	@Override
	public void setTypeofEvent(long typeofEvent) {
		_event.setTypeofEvent(typeofEvent);
	}

	@Override
	public boolean isNew() {
		return _event.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_event.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _event.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_event.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _event.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _event.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_event.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _event.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_event.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_event.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_event.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EventWrapper((Event)_event.clone());
	}

	@Override
	public int compareTo(calportlet.model.Event event) {
		return _event.compareTo(event);
	}

	@Override
	public int hashCode() {
		return _event.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<calportlet.model.Event> toCacheModel() {
		return _event.toCacheModel();
	}

	@Override
	public calportlet.model.Event toEscapedModel() {
		return new EventWrapper(_event.toEscapedModel());
	}

	@Override
	public calportlet.model.Event toUnescapedModel() {
		return new EventWrapper(_event.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _event.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _event.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_event.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EventWrapper)) {
			return false;
		}

		EventWrapper eventWrapper = (EventWrapper)obj;

		if (Validator.equals(_event, eventWrapper._event)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Event getWrappedEvent() {
		return _event;
	}

	@Override
	public Event getWrappedModel() {
		return _event;
	}

	@Override
	public void resetOriginalValues() {
		_event.resetOriginalValues();
	}

	private Event _event;
}