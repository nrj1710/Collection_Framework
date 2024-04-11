package arraye_list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraye_List_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ArrayList<Integer> list1 =new ArrayList<>();
		System.out.println("Size:"+ list1.size());
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(20);
		list1.add(30);
		list1.add(50);
		
		// index start from 0
		System.out.println("size:"+ list1.size());
		int x= list1.get(3);
		System.out.println(x);
		System.out.println(list1.get(5));
		System.out.println(list1);
		list1.remove(4);
		System.out.println(list1);
		System.out.println("size:"+ list1.size());
		
		list1.add(1, 90);
		System.out.println("size:"+list1.size());
		System.out.println(list1);
		System.out.println(list1.contains(90));
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.addAll(list1);
		System.out.println(list2);
		list2.add(100);
		System.out.println("size:"+list2.size());
		System.out.println(list2);
		System.out.println(list1);
 		System.out.println(list2.containsAll(list1));
 		
 		
 		System.out.println(list2.equals(list1));
 		System.out.println(list2.isEmpty());
 		
 		
 		 for (int i = 0; i < list2.size(); i++) {
 			 System.out.println(list2.get(i));
			
		}
 		 for (Integer value : list2) {
 			 System.out.println(value);
			
		}
 		 Collections.sort(list2);
 		 System.out.println("**************");
 		 System.out.println(list2);
 		 
 		 
 		 Collections.sort(list2,Collections.reverseOrder());
 		 System.out.println(list2);
 		 
	}

}
