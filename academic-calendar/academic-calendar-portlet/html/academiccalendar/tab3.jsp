<%@include file="/html/init.jsp"%>

<liferay-ui:search-container
	emptyResultsMessage="event-empty-results-message">

	<liferay-ui:search-container-results
		results="<%=EventLocalServiceUtil.getEventsBytype(3,
						EventLocalServiceUtil.getEventsByToday(3) - 1,
						searchContainer.getEnd())%>"
		total="<%= EventLocalServiceUtil.getEventsCountByType(3) %>" />

	<liferay-ui:search-container-row className="calportlet.model.Event"
		keyProperty="eventId" modelVar="event" escapedModel="<%=true%>">

		<liferay-ui:search-container-column-text name="name"
			value='<%=themeDisplay.getLocale().getCountry()
							.contentEquals("HU") ? event.getName_hu() : event
							.getName_en()%>' />

		<%
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		%>

		<liferay-ui:search-container-column-text name="date"
			value="<%=sdf.format(event.getEventDate())%>" cssClass="date-row" />

		<liferay-ui:search-container-column-text name="TVSZ"
			value="<%=event.getTvsz()%>" cssClass="tvsz-row" />


		<c:forEach var="role" items="<%=userRoles%>">
			<c:if
				test="${ role.getName() == 'Administrator' }">

				<liferay-ui:search-container-column-jsp align="right"
					path="/html/academiccalendar/event_actions.jsp" cssClass="tvsz-row" />

			</c:if>
		</c:forEach>

	</liferay-ui:search-container-row>


	<liferay-ui:search-iterator paginate="false" />
</liferay-ui:search-container>