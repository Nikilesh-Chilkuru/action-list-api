package com.actionlistapi.services;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RouteNodeConverter implements AttributeConverter<String[], String>{

	@Override
	public String convertToDatabaseColumn(String[] str) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length;i++){
			sb.append(str[i]).append("|");
		}
		sb.setLength(sb.length()-1);
		return sb.toString();
	}
	
	@Override
	public String[] convertToEntityAttribute(String str) {
		String[] s = str.split("|");
		return s;
	}

}
