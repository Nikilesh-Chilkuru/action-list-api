package com.actionlistapi.services;

import com.actionlistapi.pojo.ProcessInstanceStatus;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ProcessInstanceStatusConverter implements AttributeConverter<ProcessInstanceStatus, String>{
	
    @Override
    public String convertToDatabaseColumn(ProcessInstanceStatus pis) {
        StringBuilder sb = new StringBuilder();
        sb.append(pis.getCode());
        return sb.toString();
    }

    @Override
    public ProcessInstanceStatus convertToEntityAttribute(String str) {
        return new ProcessInstanceStatus(str);
    }
}
