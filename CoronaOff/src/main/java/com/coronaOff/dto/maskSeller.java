package com.coronaOff.dto;

public class maskSeller {

	private int sellerSeq;
	private String sellerName;
	private String sellerHomePage;

	public int getSellerSeq() {
		return sellerSeq;
	}

	public void setSellerSeq(int sellerSeq) {
		this.sellerSeq = sellerSeq;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerHomePage() {
		return sellerHomePage;
	}

	public void setSellerHomePage(String sellerHomePage) {
		this.sellerHomePage = sellerHomePage;
	}

	public maskSeller(int sellerSeq, String sellerName, String sellerHomePage) {
		this.sellerSeq = sellerSeq;
		this.sellerName = sellerName;
		this.sellerHomePage = sellerHomePage;
	}

	public maskSeller() {
	}

	@Override
	public String toString() {
		return "maskSeller [sellerSeq=" + sellerSeq + ", sellerName=" + sellerName + ", sellerHomePage="
				+ sellerHomePage + "]";
	}

}
