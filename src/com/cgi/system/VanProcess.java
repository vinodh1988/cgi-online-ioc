package com.cgi.system;

import org.springframework.stereotype.Component;

@Component("vprocess")
public class VanProcess implements PurchaseProcess {

	@Override
	public void process(String activity) {
		// TODO Auto-generated method stub
		System.out.println(activity+" is perfomed on van");
	}
  
}
