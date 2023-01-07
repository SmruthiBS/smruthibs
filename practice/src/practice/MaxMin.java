package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MaxMin {
    public static void main(String args[])
    {
    	
        // Creating arraylist
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer>list=new LinkedList<Integer>();
       list.listIterator();
       arr.iterator();
        
  
        // Adding object in arraylist
        arr.add(45);
        arr.add(333);
        arr.add(76);
        arr.add(29);
        arr.add(900);
        arr.add(23);
        arr.add(474);
        arr.add(654);
        arr.add(29);
        arr.add(454);
        
        
  
        int n = arr.size();
  
        
        System.out.println("ArrayList elements are :");
  
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
  
        System.out.println();
  
       
        int max = Collections.max(arr);
        System.out.println("Maximum is : " + max);//maximum
  
        int min = Collections.min(arr);
        System.out.println("Minimum is : " + min);//minimum
    }
}
