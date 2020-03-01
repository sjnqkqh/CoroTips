package com.coronaOff.dto;

public class hospital {

	private int hospSeq;
	private String hospCity;
	private String hospTown;
	private String hospName;
	private String hospTel;
	
	public hospital() {}

	public int getHospSeq() {
		return hospSeq;
	}

	public void setHospSeq(int hospSeq) {
		this.hospSeq = hospSeq;
	}

	public String getHospCity() {
		return hospCity;
	}

	public void setHospCity(String hospCity) {
		this.hospCity = hospCity;
	}

	public String getHospTown() {
		return hospTown;
	}

	public void setHospTown(String hospTown) {
		this.hospTown = hospTown;
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public String getHospTel() {
		return hospTel;
	}

	public void setHospTel(String hospTel) {
		this.hospTel = hospTel;
	}

	public hospital(int hospSeq, String hospCity, String hospTown, String hospName, String hospTel) {
		this.hospSeq = hospSeq;
		this.hospCity = hospCity;
		this.hospTown = hospTown;
		this.hospName = hospName;
		this.hospTel = hospTel;
	}

	@Override
	public String toString() {
		return "hospital [hospSeq=" + hospSeq + ", hospCity=" + hospCity + ", hospTown=" + hospTown + ", hospName="
				+ hospName + ", hospTel=" + hospTel + "]";
	}
	
	

}
