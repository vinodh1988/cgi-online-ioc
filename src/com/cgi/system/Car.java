package com.cgi.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
Parts parts;

@Autowired
PurchaseProcess cprocess;

	public Car(Parts parts) {
	super();
	this.parts = parts;
    }


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("The Vehicle is Car...!!!!");
		parts.assemble("Wheel");
		parts.assemble("Tyre");
		cprocess.process("Registration");
		cprocess.process("Payment");
	}

}
