package com.cgi.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.system.Vehicle;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
	
		Vehicle  v=(Vehicle)ac.getBean("car");
		
	    v.show();
	    

	    
	    v=(Vehicle) ac.getBean("van");
	    
	    v.show();
		
		
		
	}

}
