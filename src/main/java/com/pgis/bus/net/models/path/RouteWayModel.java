package com.pgis.bus.net.models.path;

public class RouteWayModel extends WayModel {
	private int ID;
	private String type;
	private String name;
	private int startInd;
	private int finishInd;
	
	private String start;
	private String finish;

	private int wait;
	private int freq;
	
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
		return startInd;
	}

	public void setStartRelationIndex(int startRelationIndex) {
		this.startInd = startRelationIndex;
	}

	public int getFinishRelationIndex() {
		return finishInd;
	}

	public void setFinishRelationIndex(int finishRelationIndex) {
		this.finishInd = finishRelationIndex;
	}

	public String getStartStation() {
		return start;
	}

	public void setStartStation(String startStation) {
		this.start = startStation;
	}

	public String getFinishStation() {
		return finish;
	}

	public void setFinishStation(String finishStation) {
		this.finish = finishStation;
	}

	public int getWaitBeforeTimeSecs() {
		return wait;
	}

	public void setWaitBeforeTimeSecs(int waitBeforeTimeSecs) {
		this.wait = waitBeforeTimeSecs;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWholeTimeSecs() {
		return this.wait + this.moveTimeSecs;
	}
	

	public int getFrequency() {
		return freq;
	}

	public void setFrequency(int freq) {
		this.freq = freq;
	}


}
