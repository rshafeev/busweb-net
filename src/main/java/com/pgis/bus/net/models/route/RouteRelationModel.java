package com.pgis.bus.net.models.route;

import javax.xml.bind.annotation.XmlRootElement;

import com.pgis.bus.net.models.TimeIntervalModel;
import com.pgis.bus.net.models.geom.PolyLineModel;
import com.pgis.bus.net.models.station.StationModel;

@XmlRootElement
public class RouteRelationModel {
	private int id;
	private int index;
	private double distance;
	private TimeIntervalModel move;
	private PolyLineModel geom;
	private StationModel currStation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public TimeIntervalModel getMoveTime() {
		return move;
	}

	public void setMoveTime(TimeIntervalModel move) {
		this.move = move;
	}

	public PolyLineModel getGeom() {
		return geom;
	}

	public void setGeom(PolyLineModel geom) {
		this.geom = geom;
	}

	public StationModel getCurrStation() {
		return currStation;
	}

	public void setCurrStation(StationModel currStation) {
		this.currStation = currStation;
	}

}
