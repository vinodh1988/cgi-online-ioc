package com.cgi.system2;

import org.springframework.stereotype.Component;

@Component("cconfig")
public class ComputerConfig implements Config {

	@Override
	public void deviceConfig() {
		// TODO Auto-generated method stub
		System.out.println("Computer Config will be printed here...");
	}

}
