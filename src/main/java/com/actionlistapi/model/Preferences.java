package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Preferences {
	
	@OneToOne
	private Colors colors;

	public Colors getColors() {
		return colors;
	}

	public void setColors(Colors colors) {
		this.colors = colors;
	}
	
}
