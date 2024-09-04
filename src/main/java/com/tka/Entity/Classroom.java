package com.tka.Entity;

import org.springframework.stereotype.Component;

@Component
public class Classroom {
	int clsid;
	String clsname;

	public int getClsid() {
		return clsid;
	}

	public void setClsid(int clsid) {
		this.clsid = clsid;
	}

	public String getClsname() {
		return clsname;
	}

	public void setClsname(String clsname) {
		this.clsname = clsname;
	}

	@Override
	public String toString() {
		return "Classroom [clsid=" + clsid + ", clsname=" + clsname + "]";
	}

	public Classroom(int clsid, String clsname) {
		super();
		this.clsid = clsid;
		this.clsname = clsname;
	}

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

}
