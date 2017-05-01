package com.actionlistapi.pojo;

import lombok.Data;

@Data
public class ActionRequested {

    private String code;
	
    public ActionRequested(String code){
        this.code = code;
    }

    public String getLabel() {
        switch(getCode())
        {
        case "K":
            return "Acknowledge";
        case "A":
            return "Approve";
        case "F":
            return "Clear FYI";
        case "R":
            return "Route";
        default:
            return "No Mapping Found";
        }
    }
}
