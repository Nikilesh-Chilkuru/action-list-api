package com.actionlistapi.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.actionlistapi.pojo.ActionRequested;
import com.actionlistapi.pojo.ProcessInstanceStatus;
import com.actionlistapi.pojo.ProcessType;
import com.actionlistapi.pojo._Links;

@Entity(name="actionrequest")
public class ActionRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String processInstanceId;
	
//	private ProcessType processType;
	
	private String title;
	
//	private ProcessInstanceStatus processInstanceStatus;
	
//	private ActionRequested actionRequested;
	
	private String initiator;

	private String delegator;
	
	private String group;
	
//	private ArrayList<String> routeNodes;
	
	private String lastApprovedDate;
	
	private String creationDate;
	
//	private _Links _links;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

//	public ProcessType getProcessType() {
//		return processType;
//	}
//
//	public void setProcessType(ProcessType processType) {
//		this.processType = processType;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public ProcessInstanceStatus getProcessInstanceStatus() {
//		return processInstanceStatus;
//	}
//
//	public void setProcessInstanceStatus(ProcessInstanceStatus processInstanceStatus) {
//		this.processInstanceStatus = processInstanceStatus;
//	}
//
//	public ActionRequested getActionRequested() {
//		return actionRequested;
//	}
//
//	public void setActionRequested(ActionRequested actionRequested) {
//		this.actionRequested = actionRequested;
//	}

	public String getInitiator() {
		return initiator;
	}

	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}

	public String getDelegator() {
		return delegator;
	}

	public void setDelegator(String delegator) {
		this.delegator = delegator;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

//	public ArrayList<String> getRouteNodes() {
//		return routeNodes;
//	}
//
//	public void setRouteNodes(ArrayList<String> routeNodes) {
//		this.routeNodes = routeNodes;
//	}

	public String getLastApprovedDate() {
		return lastApprovedDate;
	}

	public void setLastApprovedDate(String lastApprovedDate) {
		this.lastApprovedDate = lastApprovedDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

//	public _Links get_links() {
//		return _links;
//	}
//
//	public void set_links(_Links _links) {
//		this._links = _links;
//	}
//	
	
	
	
	
}
