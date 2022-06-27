package com.samer.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

	private String aname;
	private String mname ;
	private String fname ;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "AlienName [aname=" + aname + ", mname=" + mname + ", fname=" + fname + "]";
	}
	
	
	
}
