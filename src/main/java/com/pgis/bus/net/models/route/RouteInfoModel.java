package com.pgis.bus.net.models.route;

import com.pgis.bus.net.models.TimeIntervalModel;

public class RouteInfoModel {

	private int id;
	private String number;
	private double cost;
	private TimeIntervalModel startWork;
	private TimeIntervalModel finishWork;
	private TimeIntervalModel minInterval;
	private TimeIntervalModel maxInterval;

	private String startStation;
	private String finishStation;

	public RouteInfoModel() {

	}

	public RouteInfoModel(RouteInfoModel copy) {
		this.id = copy.id;
		this.number = copy.number;
		this.cost = copy.cost;
		this.startWork = copy.startWork;
		this.finishWork = copy.finishWork;
		this.minInterval = copy.minInterval;
		this.maxInterval = copy.maxInterval;
		this.startStation = copy.startStation;
		this.finishStation = copy.finishStation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public TimeIntervalModel getStartWork() {
		return startWork;
	}

	public void setStartWork(TimeIntervalModel startWork) {
		this.startWork = startWork;
	}

	public TimeIntervalModel getFinishWork() {
		return finishWork;
	}

	public void setFinishWork(TimeIntervalModel finishWork) {
		this.finishWork = finishWork;
	}

	public TimeIntervalModel getMinInterval() {
		return minInterval;
	}

	public void setMinInterval(TimeIntervalModel minInterval) {
		this.minInterval = minInterval;
	}

	public TimeIntervalModel getMaxInterval() {
		return maxInterval;
	}

	public void setMaxInterval(TimeIntervalModel maxInterval) {
		this.maxInterval = maxInterval;
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

}
