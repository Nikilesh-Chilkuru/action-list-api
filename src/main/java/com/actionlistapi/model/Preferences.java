package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class Preferences {
	
    @Id 
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy = "uuid")
    private String id;

    @OneToOne
    private Colors colors;

    private String username;

}
