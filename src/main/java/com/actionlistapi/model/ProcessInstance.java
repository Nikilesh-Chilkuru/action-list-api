package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class ProcessInstance {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    private String title;

    private String processType;

    private String initiator;

    private String initiatorDisplayName;

    private String content;

    private String referencedId;

    private String status;

    private String created;

    private String lastUpdated;

    private String displayStatus;
}
