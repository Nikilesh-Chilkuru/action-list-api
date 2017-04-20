package com.actionlistapi.services;

import com.actionlistapi.pojo.ProcessInstanceStatus;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ProcessInstanceStatusConverter implements AttributeConverter<ProcessInstanceStatus, String>{
	
	 private static final String SEPARATOR = "|";

	@Override
	public String convertToDatabaseColumn(ProcessInstanceStatus pis) {
		StringBuilder sb = new StringBuilder();
		sb.append(pis.getCode()).append(SEPARATOR).append(pis.getLabel());
		return sb.toString();
	}

	@Override
	public ProcessInstanceStatus convertToEntityAttribute(String str) {
		String[] s = str.split(SEPARATOR);
		return new ProcessInstanceStatus(s[0],s[1]);
	}

}
