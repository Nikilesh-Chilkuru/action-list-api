package com.actionlistapi.pojo;

public class ActionRequested {

	private String code;
	
	public ActionRequested(String code){
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		switch(getCode())
		{
		case "P":
			return "Preroute";
		case "R":
			return "Enroute";
		case "C":
			return "Completed";
		case "A":
			return "Aborted";
		case "S":
			return "Suspended";
		default:
			return "No Mapping Found";
		}
	}	
}
