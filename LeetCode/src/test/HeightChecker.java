package test;

import java.util.Arrays;

public class HeightChecker 
{
	public static int heightChecker(int[] heights) {
        int count=0;
        
//        int[] expected=new int[heights.length];
//        for(int i=0;i<heights.length;i++) {
//        	expected[i]=heights[i];
//        }
//        System.out.println(Arrays.toString(expected));
//        Arrays.sort(expected);
//        System.out.println(Arrays.toString(expected));
        
    //    int[] expected=heights.clone();  // clone() makes a copy of that array
        int[] expected=Arrays.copyOf(heights, heights.length);
        System.out.println(Arrays.toString(expected));
	    Arrays.sort(expected);
	    System.out.println(Arrays.toString(expected));
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		int[] heights= {1,1,4,2,1,3};
		int count=heightChecker(heights);
		System.out.println(count);
	}
}
