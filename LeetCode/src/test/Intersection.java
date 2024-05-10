package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
	 public static int[] intersection(int[] nums1, int[] nums2) 
	 {
		Set<Integer> set1=new HashSet<Integer>();
		for(Integer num:nums1) {
			set1.add(num);
		}
		Set<Integer> set2=new HashSet<Integer>();
		for(Integer num2:nums2) {
			if(set1.contains(num2))
				set2.add(num2);
		}
		return set2.stream().mapToInt(Integer::intValue).toArray();
		
	 }
	 public static void main(String[] args) {
		int[] nums1= {4,9,5}, nums2= {9,4,9,8,4};
		int[] res=intersection(nums1, nums2);
		System.out.println(Arrays.toString(res));
	}
}
