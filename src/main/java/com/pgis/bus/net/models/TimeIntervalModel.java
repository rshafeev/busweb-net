package com.pgis.bus.net.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
public class TimeIntervalModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5708719686233284063L;

	private double time;

	public TimeIntervalModel() {

	}

	public TimeIntervalModel(int time) {
		this.time = time;
	}

	public TimeIntervalModel(double time) {
		this.time = time;
	}

	@JsonIgnore
	public int getHours() {
		return (int) time / 60 / 60;
	}

	@JsonIgnore
	public int getMinutes() {
		int h = (int) time / 60 / 60;
		return (int) (time - h * 60 * 60) / 60;
	}

	@JsonIgnore
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

	@JsonIgnore
	public String formatHHMM() {
		return Integer.toString(getHours()) + ":" + Integer.toString(getMinutes());
	}

}
