package com.cgi.system2;

import org.springframework.stereotype.Component;

@Component("mconfig")
public class MobileConfig implements Config{

	@Override
	public void deviceConfig() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Configuration Details will be printed here");
	}

}
