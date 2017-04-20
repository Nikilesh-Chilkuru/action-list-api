package com.actionlistapi.services;

import com.actionlistapi.pojo.ActionRequested;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ActionRequestedConverter implements AttributeConverter<ActionRequested, String>{
	
	 private static final String SEPARATOR = "|";

	@Override
	public String convertToDatabaseColumn(ActionRequested actionRequested) {
		StringBuilder sb = new StringBuilder();
		sb.append(actionRequested.getCode()).append(SEPARATOR).append(actionRequested.getLabel());
		return sb.toString();
	}

	@Override
	public ActionRequested convertToEntityAttribute(String str) {
		String[] s = str.split(SEPARATOR);
		return new ActionRequested(s[0],s[1]);
	}

}
