package com.cgi.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile implements Device{
@Autowired
Config mconfig;
	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("The Device is a Mobile...!!!!!");
		mconfig.deviceConfig();
	}

}
