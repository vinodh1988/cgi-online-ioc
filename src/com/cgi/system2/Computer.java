package com.cgi.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer implements Device {
@Autowired
Config cconfig;
	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("The device is a computer");
		cconfig.deviceConfig();
	}
  
}
