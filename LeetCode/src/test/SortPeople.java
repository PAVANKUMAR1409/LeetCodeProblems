package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {
	 public static String[] sortPeople(String[] names, int[] heights) {
		 String res[]= new String[names.length];
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 for(int i=0;i<names.length;i++) {
			 map.put(names[i], heights[i]);
		 }
		 res=map.keySet().stream().toArray(n->new String[n]);
		 return res;
	 }
	 public static void main(String[] args) {
		 String[] names= {"Mary","John","Emma"};
		 int[] heights= {180,165,170};
		 String[] res=sortPeople(names, heights);
		 System.out.println(Arrays.toString(res));
	}
}	
