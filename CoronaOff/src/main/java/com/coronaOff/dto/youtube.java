package com.coronaOff.dto;

public class youtube {

	private int yseq;
	private String thumbnail;
	private String title;
	private String channel;
	private String url;
	
	public youtube(int yseq, String thumbnail, String title, String channel, String url) {
		this.yseq = yseq;
		this.thumbnail = thumbnail;
		this.title = title;
		this.channel = channel;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public youtube() {};
	
	@Override
	public String toString() {
		return "youtube [yseq=" + yseq + ", thumbnail=" + thumbnail + ", title=" + title + ", channel=" + channel
				+ ", url=" + url + "]";
	}
	public int getYseq() {
		return yseq;
	}
	public void setYseq(int yseq) {
		this.yseq = yseq;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
}
