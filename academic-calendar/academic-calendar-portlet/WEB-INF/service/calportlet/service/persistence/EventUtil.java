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

package calportlet.service.persistence;

import calportlet.model.Event;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the event service. This utility wraps {@link EventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author robert
 * @see EventPersistence
 * @see EventPersistenceImpl
 * @generated
 */
public class EventUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Event event) {
		getPersistence().clearCache(event);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Event update(Event event) throws SystemException {
		return getPersistence().update(event);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Event update(Event event, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(event, serviceContext);
	}

	/**
	* Returns all the events where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_hu(
		java.lang.String name_hu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_hu(name_hu);
	}

	/**
	* Returns a range of all the events where name_hu = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name_hu the name_hu
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_hu(
		java.lang.String name_hu, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_hu(name_hu, start, end);
	}

	/**
	* Returns an ordered range of all the events where name_hu = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name_hu the name_hu
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_hu(
		java.lang.String name_hu, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByName_hu(name_hu, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByName_hu_First(
		java.lang.String name_hu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_hu_First(name_hu, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByName_hu_First(
		java.lang.String name_hu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_hu_First(name_hu, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByName_hu_Last(
		java.lang.String name_hu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_hu_Last(name_hu, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByName_hu_Last(
		java.lang.String name_hu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_hu_Last(name_hu, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where name_hu = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param name_hu the name_hu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event[] findByName_hu_PrevAndNext(
		long eventId, java.lang.String name_hu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByName_hu_PrevAndNext(eventId, name_hu,
			orderByComparator);
	}

	/**
	* Removes all the events where name_hu = &#63; from the database.
	*
	* @param name_hu the name_hu
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName_hu(java.lang.String name_hu)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName_hu(name_hu);
	}

	/**
	* Returns the number of events where name_hu = &#63;.
	*
	* @param name_hu the name_hu
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName_hu(java.lang.String name_hu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName_hu(name_hu);
	}

	/**
	* Returns all the events where name_en = &#63;.
	*
	* @param name_en the name_en
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_en(
		java.lang.String name_en)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_en(name_en);
	}

	/**
	* Returns a range of all the events where name_en = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name_en the name_en
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_en(
		java.lang.String name_en, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_en(name_en, start, end);
	}

	/**
	* Returns an ordered range of all the events where name_en = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name_en the name_en
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByName_en(
		java.lang.String name_en, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByName_en(name_en, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where name_en = &#63;.
	*
	* @param name_en the name_en
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByName_en_First(
		java.lang.String name_en,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_en_First(name_en, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where name_en = &#63;.
	*
	* @param name_en the name_en
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByName_en_First(
		java.lang.String name_en,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_en_First(name_en, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where name_en = &#63;.
	*
	* @param name_en the name_en
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByName_en_Last(
		java.lang.String name_en,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName_en_Last(name_en, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where name_en = &#63;.
	*
	* @param name_en the name_en
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByName_en_Last(
		java.lang.String name_en,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_en_Last(name_en, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where name_en = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param name_en the name_en
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event[] findByName_en_PrevAndNext(
		long eventId, java.lang.String name_en,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByName_en_PrevAndNext(eventId, name_en,
			orderByComparator);
	}

	/**
	* Removes all the events where name_en = &#63; from the database.
	*
	* @param name_en the name_en
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName_en(java.lang.String name_en)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName_en(name_en);
	}

	/**
	* Returns the number of events where name_en = &#63;.
	*
	* @param name_en the name_en
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName_en(java.lang.String name_en)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName_en(name_en);
	}

	/**
	* Returns all the events where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByEventDate(
		java.util.Date eventDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEventDate(eventDate);
	}

	/**
	* Returns a range of all the events where eventDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventDate the event date
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByEventDate(
		java.util.Date eventDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEventDate(eventDate, start, end);
	}

	/**
	* Returns an ordered range of all the events where eventDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventDate the event date
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByEventDate(
		java.util.Date eventDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEventDate(eventDate, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByEventDate_First(
		java.util.Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEventDate_First(eventDate, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByEventDate_First(
		java.util.Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEventDate_First(eventDate, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByEventDate_Last(
		java.util.Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEventDate_Last(eventDate, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByEventDate_Last(
		java.util.Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEventDate_Last(eventDate, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where eventDate = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param eventDate the event date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event[] findByEventDate_PrevAndNext(
		long eventId, java.util.Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEventDate_PrevAndNext(eventId, eventDate,
			orderByComparator);
	}

	/**
	* Removes all the events where eventDate = &#63; from the database.
	*
	* @param eventDate the event date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEventDate(java.util.Date eventDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEventDate(eventDate);
	}

	/**
	* Returns the number of events where eventDate = &#63;.
	*
	* @param eventDate the event date
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEventDate(java.util.Date eventDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEventDate(eventDate);
	}

	/**
	* Returns all the events where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByTypeofEvent(
		long typeofEvent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTypeofEvent(typeofEvent);
	}

	/**
	* Returns a range of all the events where typeofEvent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeofEvent the typeof event
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByTypeofEvent(
		long typeofEvent, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTypeofEvent(typeofEvent, start, end);
	}

	/**
	* Returns an ordered range of all the events where typeofEvent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeofEvent the typeof event
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findByTypeofEvent(
		long typeofEvent, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTypeofEvent(typeofEvent, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByTypeofEvent_First(
		long typeofEvent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTypeofEvent_First(typeofEvent, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByTypeofEvent_First(
		long typeofEvent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTypeofEvent_First(typeofEvent, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws calportlet.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByTypeofEvent_Last(
		long typeofEvent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTypeofEvent_Last(typeofEvent, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByTypeofEvent_Last(
		long typeofEvent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTypeofEvent_Last(typeofEvent, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where typeofEvent = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param typeofEvent the typeof event
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event[] findByTypeofEvent_PrevAndNext(
		long eventId, long typeofEvent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTypeofEvent_PrevAndNext(eventId, typeofEvent,
			orderByComparator);
	}

	/**
	* Removes all the events where typeofEvent = &#63; from the database.
	*
	* @param typeofEvent the typeof event
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTypeofEvent(long typeofEvent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTypeofEvent(typeofEvent);
	}

	/**
	* Returns the number of events where typeofEvent = &#63;.
	*
	* @param typeofEvent the typeof event
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTypeofEvent(long typeofEvent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTypeofEvent(typeofEvent);
	}

	/**
	* Caches the event in the entity cache if it is enabled.
	*
	* @param event the event
	*/
	public static void cacheResult(calportlet.model.Event event) {
		getPersistence().cacheResult(event);
	}

	/**
	* Caches the events in the entity cache if it is enabled.
	*
	* @param events the events
	*/
	public static void cacheResult(
		java.util.List<calportlet.model.Event> events) {
		getPersistence().cacheResult(events);
	}

	/**
	* Creates a new event with the primary key. Does not add the event to the database.
	*
	* @param eventId the primary key for the new event
	* @return the new event
	*/
	public static calportlet.model.Event create(long eventId) {
		return getPersistence().create(eventId);
	}

	/**
	* Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the event
	* @return the event that was removed
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event remove(long eventId)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(eventId);
	}

	public static calportlet.model.Event updateImpl(
		calportlet.model.Event event)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(event);
	}

	/**
	* Returns the event with the primary key or throws a {@link calportlet.NoSuchEventException} if it could not be found.
	*
	* @param eventId the primary key of the event
	* @return the event
	* @throws calportlet.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event findByPrimaryKey(long eventId)
		throws calportlet.NoSuchEventException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(eventId);
	}

	/**
	* Returns the event with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eventId the primary key of the event
	* @return the event, or <code>null</code> if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static calportlet.model.Event fetchByPrimaryKey(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(eventId);
	}

	/**
	* Returns all the events.
	*
	* @return the events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calportlet.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<calportlet.model.Event> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the events from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of events.
	*
	* @return the number of events
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EventPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EventPersistence)PortletBeanLocatorUtil.locate(calportlet.service.ClpSerializer.getServletContextName(),
					EventPersistence.class.getName());

			ReferenceRegistry.registerReference(EventUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EventPersistence persistence) {
	}

	private static EventPersistence _persistence;
}