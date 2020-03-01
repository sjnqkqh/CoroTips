package com.coronaOff.dto;

public class patienRoute {

	private int rseq;
	private int pnum;
	private int rnum;
	public patienRoute(int rseq, int pnum, int rnum, String route) {
		this.rseq = rseq;
		this.pnum = pnum;
		this.rnum = rnum;
		this.route = route;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	private String route;
	
	public patienRoute() {};
	
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public patienRoute(int rseq, int pnum, String route) {
		this.rseq = rseq;
		this.pnum = pnum;
		this.route = route;
	}

	@Override
	public String toString() {
		return "patienRoute [rseq=" + rseq + ", pnum=" + pnum + ", rnum=" + rnum + ", route=" + route + "]";
	}
	
}
