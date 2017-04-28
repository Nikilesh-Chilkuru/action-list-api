package com.actionlistapi.services;

import com.actionlistapi.pojo.ActionRequested;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ActionRequestedConverter implements AttributeConverter<ActionRequested, String>{
	
    @Override
    public String convertToDatabaseColumn(ActionRequested actionRequested) {
        StringBuilder sb = new StringBuilder();
        sb.append(actionRequested.getCode());
        return sb.toString();
	}

    @Override
    public ActionRequested convertToEntityAttribute(String str) {
        return new ActionRequested(str);
    }
}
