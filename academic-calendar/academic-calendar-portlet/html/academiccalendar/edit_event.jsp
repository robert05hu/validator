<%@include file="/html/init.jsp" %>

<%
	Event event = null;

	long eventId = ParamUtil.getLong(request, "eventId");

	if (eventId > 0) {
		event = EventLocalServiceUtil.getEvent(eventId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= event %>" model="<%= Event.class %>" />
<portlet:renderURL var="viewEventURL" />
<portlet:actionURL name='<%= event == null ? "addEvent" : "updateEvent" %>' var="editEventURL" windowState="normal" />

<!-- adding selection for types, input for event names, and date -->

<liferay-ui:header
	backURL="<%= viewEventURL %>"
	title='<%= (event != null) ? event.getName_en() : "new-event" %>'
/>

	<aui:form action="<%= editEventURL %>" method="POST" name="fm">
	
	
	
	<aui:select label="selection-box" name="selection">
		<aui:option value="1" selected="<%= (event!=null) ? event.getTypeofEvent() == 1 : true %>"><liferay-ui:message key="general"  /></aui:option>
		<aui:option value="2" selected="<%= (event!=null) ? event.getTypeofEvent() == 2 : false %>"><liferay-ui:message key="student" /></aui:option>
		<aui:option value="3" selected="<%= (event!=null) ? event.getTypeofEvent() == 3 : false %>"><liferay-ui:message key="teacher" /></aui:option>
		<aui:option value="4" selected="<%= (event!=null) ? event.getTypeofEvent() == 4 : false %>"><liferay-ui:message key="teacher/EO" /></aui:option>
	</aui:select>
		
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="eventId" value='<%= event == null ? "" : event.getEventId() %>'/>

		<liferay-ui:error key="eventname_hu-required" message="eventname_hu-required" />
		<aui:input type="textarea" name="name_hu"/>
		<liferay-ui:error key="eventname_en-required" message="eventname_en-required" />
		<aui:input type="textarea" name="name_en"/>
		<liferay-ui:error key="dateformat-required" message="dateformat-required" />
		<aui:input type="text" name="tvsz"/>

		<aui:input type="date" name="select-date" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel"  onClick="<%= viewEventURL %>" />
	</aui:button-row>
</aui:form>


