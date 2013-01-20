package com.pgis.bus.net.models.path;

public class RouteWayModel extends WayModel {
	private int ID;
	private String type;
	private String name;
	private int startRelationIndex;
	private int finishRelationIndex;

	private String startStation;
	private String finishStation;

	private int waitBeforeTimeSecs;

	private double cost;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartRelationIndex() {
		return startRelationIndex;
	}

	public void setStartRelationIndex(int startRelationIndex) {
		this.startRelationIndex = startRelationIndex;
	}

	public int getFinishRelationIndex() {
		return finishRelationIndex;
	}

	public void setFinishRelationIndex(int finishRelationIndex) {
		this.finishRelationIndex = finishRelationIndex;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getFinishStation() {
		return finishStation;
	}

	public void setFinishStation(String finishStation) {
		this.finishStation = finishStation;
	}

	public int getWaitBeforeTimeSecs() {
		return waitBeforeTimeSecs;
	}

	public void setWaitBeforeTimeSecs(int waitBeforeTimeSecs) {
		this.waitBeforeTimeSecs = waitBeforeTimeSecs;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWholeTimeSecs() {
		return this.waitBeforeTimeSecs + this.moveTimeSecs;
	}

}
