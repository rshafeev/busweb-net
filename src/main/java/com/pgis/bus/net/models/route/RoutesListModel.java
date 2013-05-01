package com.pgis.bus.net.models.route;

import java.util.Collection;

public class RoutesListModel {

	private Collection<RouteInfoModel> routesList;
	private RouteTypeModel routeType;
	private int cityID;

	public RoutesListModel() {
	}

	public RoutesListModel(RoutesListModel copy) {
		this.cityID = copy.cityID;
		this.routeType = copy.routeType;
		this.routesList = copy.routesList;
	}

	public RouteTypeModel getRouteType() {
		return routeType;
	}

	public void setRouteType(RouteTypeModel routeType) {
		this.routeType = routeType;
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public RoutesListModel(Collection<RouteInfoModel> routesList) {
		this.routesList = routesList;
	}

	public void setRoutesList(Collection<RouteInfoModel> routesList) {
		this.routesList = routesList;
	}

	public Collection<RouteInfoModel> getRoutesList() {
		return routesList;
	}

}
