package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*     String str="My name is Chethan";
      String res="";
      char []arr = str.toCharArray();
      int left=0;
      int right=arr.length-1;
      while(left<right) {
    	  char temp=arr[left];
    	  arr[left]=arr[right];
    	  arr[right]=temp;
    	  left++;
    	  right--;
      }
      System.out.println(arr); */
	  String st="raghava";
	  int count=0;
	  char[] ar = st.toCharArray();
	  Map<Character,Integer> charMap = new HashMap<Character,Integer>();
	  for(char ch: ar) {
		  if(charMap.containsKey(ch)) {
			  charMap.put(ch, charMap.get(ch)+1);
		  }
		  else {
			  charMap.put(ch, 1);
		  }
	  }
	  System.out.println(charMap);
	  List<Integer> list  = new ArrayList<>();
	  for(Entry<Character, Integer> val:charMap.entrySet()) {
		  list.add(val.getValue());
	  }
	  Collections.sort(list);
	  
	  System.out.println(list.get(list.size()-1));
	  char max=' ';
	  for(Entry<Character,Integer> entry:charMap.entrySet()) {
		  if(entry.getValue()==list.get(list.size()-1)) {
			 max = entry.getKey();
		  }
	  }
	  System.out.println("maximum character repeated is : "+max+" and count is : "+list.get(list.size()-1));
	 
	  
	  
	  

	  
        
		

}
}
