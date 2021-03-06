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

package calportlet.model.impl;

import calportlet.model.Event;
import calportlet.model.EventModel;
import calportlet.model.EventSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Event service. Represents a row in the &quot;AcademicEvents_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link calportlet.model.EventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventImpl}.
 * </p>
 *
 * @author robert
 * @see EventImpl
 * @see calportlet.model.Event
 * @see calportlet.model.EventModel
 * @generated
 */
@JSON(strict = true)
public class EventModelImpl extends BaseModelImpl<Event> implements EventModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a event model instance should use the {@link calportlet.model.Event} interface instead.
	 */
	public static final String TABLE_NAME = "AcademicEvents_Event";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eventId", Types.BIGINT },
			{ "name_hu", Types.VARCHAR },
			{ "name_en", Types.VARCHAR },
			{ "eventDate", Types.TIMESTAMP },
			{ "tvsz", Types.VARCHAR },
			{ "typeofEvent", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table AcademicEvents_Event (eventId LONG not null primary key,name_hu VARCHAR(255) null,name_en VARCHAR(255) null,eventDate DATE null,tvsz VARCHAR(75) null,typeofEvent LONG)";
	public static final String TABLE_SQL_DROP = "drop table AcademicEvents_Event";
	public static final String ORDER_BY_JPQL = " ORDER BY event.eventDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AcademicEvents_Event.eventDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.calportlet.model.Event"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.calportlet.model.Event"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.calportlet.model.Event"),
			true);
	public static long EVENTDATE_COLUMN_BITMASK = 1L;
	public static long NAME_EN_COLUMN_BITMASK = 2L;
	public static long NAME_HU_COLUMN_BITMASK = 4L;
	public static long TYPEOFEVENT_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Event toModel(EventSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Event model = new EventImpl();

		model.setEventId(soapModel.getEventId());
		model.setName_hu(soapModel.getName_hu());
		model.setName_en(soapModel.getName_en());
		model.setEventDate(soapModel.getEventDate());
		model.setTvsz(soapModel.getTvsz());
		model.setTypeofEvent(soapModel.getTypeofEvent());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Event> toModels(EventSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Event> models = new ArrayList<Event>(soapModels.length);

		for (EventSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.calportlet.model.Event"));

	public EventModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _eventId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	@JSON
	@Override
	public String getName_hu() {
		if (_name_hu == null) {
			return StringPool.BLANK;
		}
		else {
			return _name_hu;
		}
	}

	@Override
	public void setName_hu(String name_hu) {
		_columnBitmask |= NAME_HU_COLUMN_BITMASK;

		if (_originalName_hu == null) {
			_originalName_hu = _name_hu;
		}

		_name_hu = name_hu;
	}

	public String getOriginalName_hu() {
		return GetterUtil.getString(_originalName_hu);
	}

	@JSON
	@Override
	public String getName_en() {
		if (_name_en == null) {
			return StringPool.BLANK;
		}
		else {
			return _name_en;
		}
	}

	@Override
	public void setName_en(String name_en) {
		_columnBitmask |= NAME_EN_COLUMN_BITMASK;

		if (_originalName_en == null) {
			_originalName_en = _name_en;
		}

		_name_en = name_en;
	}

	public String getOriginalName_en() {
		return GetterUtil.getString(_originalName_en);
	}

	@JSON
	@Override
	public Date getEventDate() {
		return _eventDate;
	}

	@Override
	public void setEventDate(Date eventDate) {
		_columnBitmask = -1L;

		if (_originalEventDate == null) {
			_originalEventDate = _eventDate;
		}

		_eventDate = eventDate;
	}

	public Date getOriginalEventDate() {
		return _originalEventDate;
	}

	@JSON
	@Override
	public String getTvsz() {
		if (_tvsz == null) {
			return StringPool.BLANK;
		}
		else {
			return _tvsz;
		}
	}

	@Override
	public void setTvsz(String tvsz) {
		_tvsz = tvsz;
	}

	@JSON
	@Override
	public long getTypeofEvent() {
		return _typeofEvent;
	}

	@Override
	public void setTypeofEvent(long typeofEvent) {
		_columnBitmask |= TYPEOFEVENT_COLUMN_BITMASK;

		if (!_setOriginalTypeofEvent) {
			_setOriginalTypeofEvent = true;

			_originalTypeofEvent = _typeofEvent;
		}

		_typeofEvent = typeofEvent;
	}

	public long getOriginalTypeofEvent() {
		return _originalTypeofEvent;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Event.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Event toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Event)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setEventId(getEventId());
		eventImpl.setName_hu(getName_hu());
		eventImpl.setName_en(getName_en());
		eventImpl.setEventDate(getEventDate());
		eventImpl.setTvsz(getTvsz());
		eventImpl.setTypeofEvent(getTypeofEvent());

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public int compareTo(Event event) {
		int value = 0;

		value = DateUtil.compareTo(getEventDate(), event.getEventDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Event)) {
			return false;
		}

		Event event = (Event)obj;

		long primaryKey = event.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		EventModelImpl eventModelImpl = this;

		eventModelImpl._originalName_hu = eventModelImpl._name_hu;

		eventModelImpl._originalName_en = eventModelImpl._name_en;

		eventModelImpl._originalEventDate = eventModelImpl._eventDate;

		eventModelImpl._originalTypeofEvent = eventModelImpl._typeofEvent;

		eventModelImpl._setOriginalTypeofEvent = false;

		eventModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Event> toCacheModel() {
		EventCacheModel eventCacheModel = new EventCacheModel();

		eventCacheModel.eventId = getEventId();

		eventCacheModel.name_hu = getName_hu();

		String name_hu = eventCacheModel.name_hu;

		if ((name_hu != null) && (name_hu.length() == 0)) {
			eventCacheModel.name_hu = null;
		}

		eventCacheModel.name_en = getName_en();

		String name_en = eventCacheModel.name_en;

		if ((name_en != null) && (name_en.length() == 0)) {
			eventCacheModel.name_en = null;
		}

		Date eventDate = getEventDate();

		if (eventDate != null) {
			eventCacheModel.eventDate = eventDate.getTime();
		}
		else {
			eventCacheModel.eventDate = Long.MIN_VALUE;
		}

		eventCacheModel.tvsz = getTvsz();

		String tvsz = eventCacheModel.tvsz;

		if ((tvsz != null) && (tvsz.length() == 0)) {
			eventCacheModel.tvsz = null;
		}

		eventCacheModel.typeofEvent = getTypeofEvent();

		return eventCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{eventId=");
		sb.append(getEventId());
		sb.append(", name_hu=");
		sb.append(getName_hu());
		sb.append(", name_en=");
		sb.append(getName_en());
		sb.append(", eventDate=");
		sb.append(getEventDate());
		sb.append(", tvsz=");
		sb.append(getTvsz());
		sb.append(", typeofEvent=");
		sb.append(getTypeofEvent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("calportlet.model.Event");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name_hu</column-name><column-value><![CDATA[");
		sb.append(getName_hu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name_en</column-name><column-value><![CDATA[");
		sb.append(getName_en());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventDate</column-name><column-value><![CDATA[");
		sb.append(getEventDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tvsz</column-name><column-value><![CDATA[");
		sb.append(getTvsz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeofEvent</column-name><column-value><![CDATA[");
		sb.append(getTypeofEvent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Event.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Event.class };
	private long _eventId;
	private String _name_hu;
	private String _originalName_hu;
	private String _name_en;
	private String _originalName_en;
	private Date _eventDate;
	private Date _originalEventDate;
	private String _tvsz;
	private long _typeofEvent;
	private long _originalTypeofEvent;
	private boolean _setOriginalTypeofEvent;
	private long _columnBitmask;
	private Event _escapedModel;
}