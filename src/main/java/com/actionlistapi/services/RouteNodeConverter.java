package com.actionlistapi.services;

import java.util.ArrayList;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RouteNodeConverter implements AttributeConverter<ArrayList<String>, String>{

    @Override
    public String convertToDatabaseColumn(ArrayList<String> strList) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<strList.size();i++){
            sb.append(strList.get(i)).append("|");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
	
    @Override
    public ArrayList<String> convertToEntityAttribute(String str) {
        String[] stringArray = str.split("\\|");
        ArrayList<String> sList = new ArrayList<String>();
        for(String string: stringArray) {
            sList.add(string);
        }
        return sList;
    }
}
