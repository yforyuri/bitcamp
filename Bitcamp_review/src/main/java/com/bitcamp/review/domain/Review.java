package com.bitcamp.review.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Review {
	
	private int idx;
	private String idx_c;
	private String idx_h;
	private int rate;
	private String content;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm", timezone="Asia/Seoul")
	private Date date;
	
	
	public Review() {
		this.date = new Date();
	}
		
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getIdx_c() {
		return idx_c;
	}
	public void setIdx_c(String idx_c) {
		this.idx_c = idx_c;
	}
	public String getIdx_h() {
		return idx_h;
	}
	public void setIdx_h(String idx_h) {
		this.idx_h = idx_h;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Review [idx=" + idx + ", idx_c=" + idx_c + ", idx_h=" + idx_h + ", rate=" + rate + ", content="
				+ content + ", date=" + date + "]";
	}
	public Review(String idx_c, String idx_h, int rate, String content, Date date) {

		this.idx_c = idx_c;
		this.idx_h = idx_h;
		this.rate = rate;
		this.content = content;
		this.date = date;
	}
	public Review(int idx, String idx_c, String idx_h, int rate, String content, Date date) {
		
		this.idx = idx;
		this.idx_c = idx_c;
		this.idx_h = idx_h;
		this.rate = rate;
		this.content = content;
		this.date = date;
	}
	
		
}