package com.pgis.bus.net.models.route.schedule;

public class TimetableModel {

	/**
	 * Стартовое время, сек
	 */
	private int timeA;

	/**
	 * Конечное время, сек
	 */
	private int timeB;

	/**
	 * Интервал между выездами передвижных средств с начальной станции, сек
	 */
	private int freq;

	public int getTimeA() {
		return timeA;
	}

	public void setTimeA(int timeA) {
		this.timeA = timeA;
	}

	public int getTimeB() {
		return timeB;
	}

	public void setTimeB(int timeB) {
		this.timeB = timeB;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

}
