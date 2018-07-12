package com.cgi.system2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cgi.system2"})
public class JavaConfig {
	
	@Bean(name="computer")
	public Device getDevice(){
		return new Computer();
	}
	
	@Bean(name="mobile")
	public Device getDevice2(){
		return new Mobile();
	}
	

}
