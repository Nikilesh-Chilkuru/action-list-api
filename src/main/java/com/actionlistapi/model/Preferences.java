package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Preferences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator="pref_id_seq")
	@SequenceGenerator(name="pref_id_seq",sequenceName="pref_id_seq",allocationSize=1)
	private long id;
	
	@OneToOne
	private Colors colors;

	public Colors getColors() {
		return colors;
	}

	public void setColors(Colors colors) {
		this.colors = colors;
	}
	
}
