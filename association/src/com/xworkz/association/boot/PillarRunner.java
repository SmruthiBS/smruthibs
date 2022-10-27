package com.xworkz.association.boot;

import com.xworkz.association.constants.PillarShape;
import com.xworkz.association.examples.Pillar;

public class PillarRunner {
	public static void main(String[] args) {
		Pillar pillar=new Pillar(1,"banglore",PillarShape.CIRCULAR,180,"supporting");
		pillar.showoff();
	}

}
