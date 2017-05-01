package com.actionlistapi.model;

import java.util.ArrayList;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.actionlistapi.pojo.ActionRequested;
import com.actionlistapi.pojo.ProcessInstanceStatus;
import com.actionlistapi.services.ActionRequestedConverter;
import com.actionlistapi.services.ProcessInstanceStatusConverter;
import com.actionlistapi.services.RouteNodeConverter;

import lombok.Data;

@Entity
@Data
public class ActionRequest {
	
    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy = "uuid")
    private String id;
	
    private String processInstanceId;
	
    private String username;
	
    @ManyToOne
    private ProcessType processType;
	
    private String title;
	
    @Convert(converter = ProcessInstanceStatusConverter.class)
    private ProcessInstanceStatus processInstanceStatus;

    @Convert(converter = ActionRequestedConverter.class)
    private ActionRequested actionRequested;
	
    private String initiator;

    private String delegator;
	
    private String group_;
	
    @Convert(converter = RouteNodeConverter.class)
    private ArrayList<String> routeNodes;
	
    private String lastApprovedDate;
	
    private String creationDate;
}
