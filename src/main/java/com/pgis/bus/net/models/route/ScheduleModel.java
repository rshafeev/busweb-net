package com.pgis.bus.net.models.route;

import java.util.Collection;

import com.pgis.bus.net.models.route.schedule.ScheduleGroupModel;

public class ScheduleModel {

	/**
	 * ID расписания
	 */
	private int id;

	/**
	 * ID пути, к которому относится данное расписание
	 */
	private int routeWayID;

	/**
	 * Дни недели разбиты по группам. Для каждой группы отдельное расписание
	 */
	private Collection<ScheduleGroupModel> groups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRouteWayID() {
		return routeWayID;
	}

	public void setRouteWayID(int routeWayID) {
		this.routeWayID = routeWayID;
	}

	public Collection<ScheduleGroupModel> getGroups() {
		return groups;
	}

	public void setGroups(Collection<ScheduleGroupModel> groups) {
		this.groups = groups;
	}

}
