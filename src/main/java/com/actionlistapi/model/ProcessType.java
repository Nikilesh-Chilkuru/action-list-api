package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class ProcessType {

    @Id 
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy = "uuid")
    private String id;

    private String name;

    private String label;
}
