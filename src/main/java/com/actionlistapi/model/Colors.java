package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Colors {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator="colors_id_seq")
    @SequenceGenerator(name="colors_id_seq",sequenceName="colors_id_seq",allocationSize=1)
    private String id;
	
    String S;
	
    String P;
	
    String R;
	
    String C;
	
    String A;

}
