/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.cs.test.events.model.impl;

import com.liferay.cs.test.events.model.Events;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Events in entity cache.
 *
 * @author Liferay CS
 * @generated
 */
public class EventsCacheModel implements CacheModel<Events>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EventsCacheModel)) {
			return false;
		}

		EventsCacheModel eventsCacheModel = (EventsCacheModel)object;

		if (eventId == eventsCacheModel.eventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", eventId=");
		sb.append(eventId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", department=");
		sb.append(department);
		sb.append(", visibility=");
		sb.append(visibility);
		sb.append(", maxCount=");
		sb.append(maxCount);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Events toEntityModel() {
		EventsImpl eventsImpl = new EventsImpl();

		if (uuid == null) {
			eventsImpl.setUuid("");
		}
		else {
			eventsImpl.setUuid(uuid);
		}

		eventsImpl.setEventId(eventId);
		eventsImpl.setGroupId(groupId);
		eventsImpl.setCompanyId(companyId);
		eventsImpl.setUserId(userId);

		if (userName == null) {
			eventsImpl.setUserName("");
		}
		else {
			eventsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			eventsImpl.setCreateDate(null);
		}
		else {
			eventsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			eventsImpl.setModifiedDate(null);
		}
		else {
			eventsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			eventsImpl.setName("");
		}
		else {
			eventsImpl.setName(name);
		}

		if (description == null) {
			eventsImpl.setDescription("");
		}
		else {
			eventsImpl.setDescription(description);
		}

		if (department == null) {
			eventsImpl.setDepartment("");
		}
		else {
			eventsImpl.setDepartment(department);
		}

		eventsImpl.setVisibility(visibility);
		eventsImpl.setMaxCount(maxCount);

		if (startDate == Long.MIN_VALUE) {
			eventsImpl.setStartDate(null);
		}
		else {
			eventsImpl.setStartDate(new Date(startDate));
		}

		eventsImpl.resetOriginalValues();

		return eventsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		eventId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		department = objectInput.readUTF();

		visibility = objectInput.readInt();

		maxCount = objectInput.readInt();
		startDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(eventId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(department);
		}

		objectOutput.writeInt(visibility);

		objectOutput.writeInt(maxCount);
		objectOutput.writeLong(startDate);
	}

	public String uuid;
	public long eventId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public String department;
	public int visibility;
	public int maxCount;
	public long startDate;

}