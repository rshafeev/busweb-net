package com.pgis.bus.net.models.path;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PathModel {
	int pathID;
	InputWayModel input;
	OutputWayModel output;
	Collection<TransitionWayModel> transitions;
	Collection<RouteWayModel> routes;

	
	public double getCost() {
		double cost = 0;
		for (RouteWayModel r : routes) {
			cost += r.getCost();
		}
		return cost;
	}

	public double getDistance() {
		double distance = 0;
		distance += input.getDistance();
		distance += output.getDistance();
		for (RouteWayModel r : routes) {
			distance += r.getDistance();
		}
		for (TransitionWayModel r : transitions) {
			distance += r.getDistance();
		}
		return distance;
	}

	public double getWholeTimeSecs() {
		int time = 0;
		time += input.getMoveTimeSecs();
		time += output.getMoveTimeSecs();
		for (RouteWayModel r : routes) {
			time += r.getDistance();
		}
		return time;
	}

	public int getPathID() {
		return pathID;
	}

	public void setPathID(int pathID) {
		this.pathID = pathID;
	}

	public InputWayModel getInput() {
		return input;
	}

	public void setInput(InputWayModel input) {
		this.input = input;
	}

	public OutputWayModel getOutput() {
		return output;
	}

	public void setOutput(OutputWayModel out) {
		this.output = out;
	}

	public Collection<TransitionWayModel> getTransitions() {
		return transitions;
	}

	public void setTransitions(Collection<TransitionWayModel> transitions) {
		this.transitions = transitions;
	}

	public Collection<RouteWayModel> getRoutes() {
		return routes;
	}

	public void setRoutes(Collection<RouteWayModel> routes) {
		this.routes = routes;
	}
	

	
	
}
