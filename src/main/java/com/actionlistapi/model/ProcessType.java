package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ProcessType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "proc_type_id_seq")
	@SequenceGenerator(name = "proc_type_id_seq", sequenceName = "proc_type_id_seq", allocationSize = 1)
	private long id;

	private String name;

	private String label;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
