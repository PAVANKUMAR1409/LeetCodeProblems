package test;

import java.util.HashMap;
import java.util.Map;

public class CheckIfPangram 
{
	public static boolean checkIfPangram(String sentence) 
	{
		Map<Integer,Character> map= new HashMap<Integer,Character>();
		for(int i=0;i<sentence.length();i++) {
			int chIndex=(int)sentence.charAt(i);
			if(!map.containsKey(chIndex))
				map.put(chIndex, sentence.charAt(i));
		}
		//System.out.println(map);
		for(int i=0;i<26;i++) {
			if(!map.containsKey(97+i))
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String sentence="thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}
}
