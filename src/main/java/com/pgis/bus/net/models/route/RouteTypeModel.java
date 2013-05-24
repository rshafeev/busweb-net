package com.pgis.bus.net.models.route;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
public class RouteTypeModel {

	private String id;
	private String name;

	@JsonIgnore
	private void _setId(String dbRouteTypeID) {
		this.id = getRouteType(dbRouteTypeID);
	}

	public RouteTypeModel() {
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

	public void setId(String id) {
		_setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public String getDbId() {
		return getDBRouteType(this.id);
	}

	public static String getDBRouteType(String routeTypeID) {
		return "c_route_" + routeTypeID;
	}

	public static String getRouteType(String dbRouteTypeID) {
		return dbRouteTypeID.substring(8);
	}
}
