package com.pgis.bus.net.models;

public class TimeIntervalModel {

	private double time;

	public TimeIntervalModel(int time) {
		this.time = time;
	}

	public TimeIntervalModel(double time) {
		this.time = time;
	}

	public int getHours() {
		return (int) time / 60 / 60;
	}

	public int getMinutes() {
		int h = (int) time / 60 / 60;
		return (int) (time - h * 60 * 60) / 60;
	}

	public int getSeconds() {
		int h = (int) time / 60 / 60;
		int m = (int) (time - h * 60 * 60) / 60;
		return (int) time - h * 60 * 60 - m * 60;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public String formatHHMM() {
		return Integer.toString(getHours()) + ":" + Integer.toString(getMinutes());
	}
}
