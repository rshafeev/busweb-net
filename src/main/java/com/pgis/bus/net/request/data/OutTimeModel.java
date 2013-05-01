package com.pgis.bus.net.request.data;

import com.pgis.bus.net.models.DayEnumModel;

public class OutTimeModel {

	/**
	 * День выезда
	 */
	private DayEnumModel dayID;

	/**
	 * Время выезда, мсек
	 */
	private long timeStartSecs;

	public OutTimeModel() {

	}

	public OutTimeModel(DayEnumModel dayID, int hour, int mins) {
		timeStartSecs = (hour * 60 * 60 + mins * 60);
		this.dayID = dayID;
	}

	public DayEnumModel getDayID() {
		return dayID;
	}

	public void setDayID(DayEnumModel dayID) {
		this.dayID = dayID;
	}

	public long getTimeStartSecs() {
		return timeStartSecs;
	}

	public void setTimeStartSecs(long timeStart) {
		this.timeStartSecs = timeStart;
	}

}
