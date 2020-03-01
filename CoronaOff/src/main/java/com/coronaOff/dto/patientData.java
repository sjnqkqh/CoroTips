package com.coronaOff.dto;

public class patientData {

	private int pnum;
	private String plocate;
	private String proute;
	
	public patientData() {};
	
	@Override
	public String toString() {
		return "patientData [pnum=" + pnum + ", plocate=" + plocate + "]";
	}



	public patientData(int pnum, String plocate, String proute) {
		this.pnum = pnum;
		this.plocate = plocate;
		this.proute = proute;
	}

	public String getProute() {
		return proute;
	}

	public void setProute(String proute) {
		this.proute = proute;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}


	public String getPlocate() {
		return plocate;
	}

	public void setPlocate(String plocate) {
		this.plocate = plocate;
	}
}
