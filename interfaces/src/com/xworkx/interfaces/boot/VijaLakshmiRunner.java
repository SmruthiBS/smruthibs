package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.VijayaLakshmi;

public class VijaLakshmiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VijayaLakshmi vij = new VijayaLakshmi("smruthi", "female", 23, 9482618680l, "vija@gmail.com");
		vij.uploadedTask();
		vij.completedProgram();
		vij.gst();
		vij.vat();
		vij.paidTax(3000);
		vij.eat();
		vij.sleep();
		vij.executeProgram();
		vij.training();

	}

}
