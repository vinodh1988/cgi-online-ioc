package com.cgi.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgi.system2.Device;
import com.cgi.system2.JavaConfig;

public class Runner2 {
	public static void main(String n[]){
  ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
 Device d=(Device) ac.getBean("computer");
 d.displayName();
 
 d=(Device)ac.getBean("mobile");
 d.displayName();
 
  
	}
}
