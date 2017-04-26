package com.actionlistapi.model;

import javax.persistence.Entity;

@Entity
public class Colors {
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
}
