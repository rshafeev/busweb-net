package com.pgis.bus.net.models.route;

import java.util.Collection;

public class RouteWayModel {
	private int id;
	private Collection<RouteRelationModel> relations;
	private ScheduleModel schedule;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<RouteRelationModel> getRelations() {
		return relations;
	}

	public void setRelations(Collection<RouteRelationModel> relations) {
		this.relations = relations;
	}

	public ScheduleModel getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleModel schedule) {
		this.schedule = schedule;
	}

}
