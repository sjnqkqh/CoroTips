package com.coronaOff.dto;

public class local {

	private int localSeq;
	private String localName;
	private int localNOP;

	public local(int localSeq, String localName, int localNOP) {

		this.localSeq = localSeq;
		this.localName = localName;
		this.localNOP = localNOP;
	}

	public local() {
	}

	@Override
	public String toString() {
		return "local [localSeq=" + localSeq + ", localName=" + localName + ", localNOP=" + localNOP + "]";
	}

	public int getLocalSeq() {
		return localSeq;
	}

	public void setLocalSeq(int localSeq) {
		this.localSeq = localSeq;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public int getLocalNOP() {
		return localNOP;
	}

	public void setLocalNOP(int localNOP) {
		this.localNOP = localNOP;
	}

}
