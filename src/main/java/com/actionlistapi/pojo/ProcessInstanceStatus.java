package com.actionlistapi.pojo;

public class ProcessInstanceStatus {

	private String code;
	private String label;
	
	public ProcessInstanceStatus(String code, String label) {
		this.code = code;
		this.label = label;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
