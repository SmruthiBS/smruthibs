package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Fish;

public class FishRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish1=new Fish();
			fish1.name="ritha";
			fish1.type="fresh water fish";
			fish1.price=50;
			fish1.length=13.5f;
			fish1.weight=250;
			System.out.println(fish1.name);
			System.out.println(fish1.type);
			System.out.println(fish1.price);
			System.out.println(fish1.length);
			System.out.println(fish1.weight);
		Fish fish2=new Fish("rani");
		Fish fish3=new Fish("rani",200);
		Fish fish4=new Fish(250,"Kajuli");
		Fish fish5=new Fish("rani",15.25f);
		Fish fish6=new Fish("rani","fresh water");
		Fish fish7=new Fish("rani","fresh water",200);
		Fish fish8=new Fish("Bangda","fresh water",300,10.25f,150.25f);
		
		
		

	}

}



