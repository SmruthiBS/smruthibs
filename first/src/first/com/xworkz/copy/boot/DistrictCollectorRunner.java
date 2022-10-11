package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.DistrictCollector;

public class DistrictCollectorRunner {
	public static void main(String[] args) {
		DistrictCollector dc=new DistrictCollector();
		dc.name="Dr. Selvaman";
		dc.age=30;
		dc.district="shimoga";
		dc.batchNo=3;
		System.out.println(dc.name);
		System.out.println(dc.age);
		System.out.println(dc.district);
		System.out.println(dc.batchNo);
		
		
	}

}
