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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Event in entity cache.
 *
 * @author robert
 * @see Event
 * @generated
 */
public class EventCacheModel implements CacheModel<Event>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{eventId=");
		sb.append(eventId);
		sb.append(", name_hu=");
		sb.append(name_hu);
		sb.append(", name_en=");
		sb.append(name_en);
		sb.append(", eventDate=");
		sb.append(eventDate);
		sb.append(", tvsz=");
		sb.append(tvsz);
		sb.append(", typeofEvent=");
		sb.append(typeofEvent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Event toEntityModel() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setEventId(eventId);

		if (name_hu == null) {
			eventImpl.setName_hu(StringPool.BLANK);
		}
		else {
			eventImpl.setName_hu(name_hu);
		}

		if (name_en == null) {
			eventImpl.setName_en(StringPool.BLANK);
		}
		else {
			eventImpl.setName_en(name_en);
		}

		if (eventDate == Long.MIN_VALUE) {
			eventImpl.setEventDate(null);
		}
		else {
			eventImpl.setEventDate(new Date(eventDate));
		}

		if (tvsz == null) {
			eventImpl.setTvsz(StringPool.BLANK);
		}
		else {
			eventImpl.setTvsz(tvsz);
		}

		eventImpl.setTypeofEvent(typeofEvent);

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eventId = objectInput.readLong();
		name_hu = objectInput.readUTF();
		name_en = objectInput.readUTF();
		eventDate = objectInput.readLong();
		tvsz = objectInput.readUTF();
		typeofEvent = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eventId);

		if (name_hu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name_hu);
		}

		if (name_en == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name_en);
		}

		objectOutput.writeLong(eventDate);

		if (tvsz == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tvsz);
		}

		objectOutput.writeLong(typeofEvent);
	}

	public long eventId;
	public String name_hu;
	public String name_en;
	public long eventDate;
	public String tvsz;
	public long typeofEvent;
}