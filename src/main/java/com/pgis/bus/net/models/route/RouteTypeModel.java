package com.pgis.bus.net.models.route;

public class RouteTypeModel {

	private String id;
	private String name;

	private void _setId(String dbRouteTypeID) {
		this.id = dbRouteTypeID.substring(8);
	}

	public RouteTypeModel(String routeTypeID) {
		_setId(routeTypeID);
	}

	public RouteTypeModel(String routeTypeID, String routeTypeName) {
		_setId(routeTypeID);
		this.name = routeTypeName;
	}

	public String getId() {
		return id;
	}

	public String getDbId() {
		return "c_route_" + this.id;
	}

	public void setId(String id) {
		_setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
