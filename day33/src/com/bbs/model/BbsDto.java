package com.bbs.model;

import java.sql.Timestamp;

public class BbsDto {
	private int num,cnt;
	private String id,sub,content;
	private Timestamp nalja;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getNalja() {
		return nalja;
	}

	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "BbsDto [num=" + num + ", cnt=" + cnt + ", id=" + id + ", sub=" + sub + ", content="
		    + content + "]";
	}

	
	
	
}
