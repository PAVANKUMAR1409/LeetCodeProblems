package test;

import java.util.Arrays;

public class ReverseWords 
{
	public static void main(String[] args) {
		String s=" hello  world  ";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) 
	{
		String[] word=s.split("\\s+");
		String res="";
		System.out.println(Arrays.toString(word));
		for(int i=word.length-1;i>=0;i--) {
			res+=word[i]+" ";
			
		}
	    return res;
	}
}
