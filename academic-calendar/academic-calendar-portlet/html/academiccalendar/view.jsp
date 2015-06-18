<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />

<%@include file="/html/init.jsp"%>

<liferay-ui:success key="event-added" message="event-added-successfully" />
<liferay-ui:success key="event-updated"
	message="event-updated-successfully" />
<liferay-ui:success key="event-deleted"
	message="event-deleted-successfully" />
	

	<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	%>

<!-- Add Event button, with user role check  -->

<% List<Role> userRoles = themeDisplay.getUser().getRoles(); %>
<c:forEach var="role" items="<%= userRoles %>">
	<c:if test="${ role.getName() == 'Administrator' }">
		
		<aui:button-row>
			<portlet:renderURL var="addEventURL">
				<portlet:param name="mvcPath"
					value="/html/academiccalendar/edit_event.jsp" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="p_p_isolated" value="1" />
			</portlet:renderURL>

			<aui:button value="add-event" onClick="<%= addEventURL.toString() %>" />

		</aui:button-row>

	</c:if>
</c:forEach>


	<div align="right" style="margin-bottom: 0px">
		<aui:input type="checkbox" name="allevent" label="all-event"
			onChange="valami()" />
	</div>
	



	 <!-- sets the portlet tab option to URL parameter  -->
	 <%
	 		PortletURL portletURL = renderResponse.createRenderURL();
	 	 	String currTAB = ParamUtil.getString(request, "currTAB", "general");
	 	 	String allevent = ParamUtil.getString(request, "tabulator", "false");
	 	 	portletURL.setParameter("currTAB", currTAB);
	 	 	portletURL.setParameter("allevent", allevent);
	 	 %>
	 	 

<liferay-ui:tabs names="general,student,teacher,teacher/EO"
	refresh="<%= true %>" param="currTAB"
	url="<%=portletURL.toString() %>">

	<!-- FIRST TAB, WITH GENERAL EVENTS -->
	<liferay-ui:section>
		<%@ include file="tab1.jsp"%>
	</liferay-ui:section>

	<!-- SECOND TAB, WITH STUDENT EVENTS -->
	<liferay-ui:section>
		<%@ include file="tab2.jsp"%>
	</liferay-ui:section>


	<!-- THIRD TAB, WITH TEACHER EVENTS -->
	<liferay-ui:section>
		<%@ include file="tab3.jsp"%>
	</liferay-ui:section>


	<!-- FOURTH TAB, TEACHER/EO -->
	<liferay-ui:section>
		<%@ include file="tab4.jsp"%>
	</liferay-ui:section>



</liferay-ui:tabs>




