package arraye_list;

import java.util.ArrayList;

public class Example_ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 =new ArrayList<>();
	
         list1.add(10);
         list1.add(20);
         list1.add(30);
         list1.add(40);
         list1.add(20);
         list1.add(38);
         list1.add(05);
         list1.add(43);
         list1.add(02);
         
         
         ArrayList<Integer> rev =new ArrayList<Integer>();
         int temp=list1.get(0);
         int index =0;
         for (int i = 0; i < list1.size(); i++) {
        	 for (int j = 0; j < list1.size(); j++) {
				if(list1.get(i)<=list1.get(j)) {
					temp=list1.get(i);
					index =list1.indexOf(j);
				}
			} 
			rev.add(temp);
			list1.remove(i);
		}
         System.out.println(rev);
	}
}
