package com.cgi.system;

import org.springframework.stereotype.Component;

@Component("cprocess")
public class CarProcess implements PurchaseProcess{

	@Override
	public void process(String activity) {
		// TODO Auto-generated method stub
		System.out.println(activity+" is perfomed on car");
	}

}
