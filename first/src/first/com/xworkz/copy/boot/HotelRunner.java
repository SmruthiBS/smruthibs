package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.constant.Payment;
import first.com.xworkz.copy.things.Hotel;

public class HotelRunner {
	public static void main(String[] args) {
		String[] maincoursesVal= {"roti","ghee rice","fried rice"};
		String[] chatsVal= {"pani puri","french fries","dahi puri"};
		String[] brevaragesVal= {"tea","coffe","lemon tea"};
		int[] tableNosVal= {1,2,3};
		String[] iceCreamsVal= {"vanila","chocolate","butterscotch"};
		String[] soupsVal= {"tomato","vegetable","mancho"};
		
		
		Hotel hotel=new Hotel("taj","banglore",true,"sagar",Payment.UPI,maincoursesVal,chatsVal,tableNosVal,soupsVal,iceCreamsVal,brevaragesVal);
		hotel.print();
		
	}

}
