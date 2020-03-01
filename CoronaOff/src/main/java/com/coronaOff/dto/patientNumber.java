package com.coronaOff.dto;

public class patientNumber {

	private int totalPatient;
	private int curedPatient;
	private int deadPatient;
	private String updateTime;

	public patientNumber(int totalPatient, int curedPatient, int deadPatient, String updateTime) {
		this.totalPatient = totalPatient;
		this.curedPatient = curedPatient;
		this.deadPatient = deadPatient;
		this.updateTime = updateTime;
	}

	public patientNumber() {}

	@Override
	public String toString() {
		return "patientNumber [totalPatient=" + totalPatient + ", curedPatient=" + curedPatient + ", deadPatient="
				+ deadPatient + ", updateTime=" + updateTime + "]";
	}

	public int getTotalPatient() {
		return totalPatient;
	}

	public void setTotalPatient(int totalPatient) {
		this.totalPatient = totalPatient;
	}

	public int getCuredPatient() {
		return curedPatient;
	}

	public void setCuredPatient(int curedPatient) {
		this.curedPatient = curedPatient;
	}

	public int getDeadPatient() {
		return deadPatient;
	}

	public void setDeadPatient(int deadPatient) {
		this.deadPatient = deadPatient;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
