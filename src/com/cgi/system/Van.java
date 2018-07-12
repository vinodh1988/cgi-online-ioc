package com.cgi.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Van implements Vehicle {

Parts parts;

@Autowired
PurchaseProcess vprocess;

public Parts getParts() {
	return parts;
}


public void setParts(Parts parts) {
	this.parts = parts;
}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("The Vehicle is van...!!!!");
		parts.assemble("Steering");
		parts.assemble("Wheel");
		vprocess.process("Insurance");
		vprocess.process("Payment");
	}

}
