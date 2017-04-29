package com.actionlistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
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

	public String getP() {
		return P;
	}

	public void setP(String p) {
		P = p;
	}

	public String getR() {
		return R;
	}

	public void setR(String r) {
		R = r;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public void setS(String s) {
		S = s;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getS() {
		return S;
	}
}
