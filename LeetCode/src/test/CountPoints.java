package test;

import java.util.Arrays;

public class CountPoints {
	 public static int countPoints(String rings) 
	 {
		 int count=0;
		 int[] r=new int[10],g=new int[10],b=new int[10];	 
		 char[] res= rings.toCharArray();
		 System.out.println(Arrays.toString(res));
		 for(int i=0;i<=res.length-1;i+=2) {
			 if(res[i]=='B') {
				b[res[i+1]-'0']++;
			 }
			 else if(res[i]=='G') {
				 g[res[i+1]-'0']++;;
			 }
			 else{
				 r[res[i+1]-'0']++;
			 }
		 }
		 for(int i=0;i<10;i++) {
			 if(b[i]>0 && r[i]>0 && g[i]>0)
				 count++;
		 }
		return count;
	 }
	 public static void main(String[] args) 
	 {
		 String rings="B0R0G0R9R0B0G0";
		 int count=countPoints(rings);
		 System.out.println(count);
	 }
}
