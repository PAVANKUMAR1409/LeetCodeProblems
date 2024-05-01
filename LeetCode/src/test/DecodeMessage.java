package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class DecodeMessage {
	public String decodeMessage(String key, String message)
	{
		StringBuilder res= new StringBuilder();
		key = key.replace(" ","");
		Map<Character,Character> map=new LinkedHashMap<>();
		char ch='a';
		for(int i=0;i<key.length();i++) {
			if(!map.containsKey(key.charAt(i))) {
				map.put(key.charAt(i), ch++);
			}
		}
		//System.out.println(map);
		for(int i=0;i<message.length();i++) {
			if(map.containsKey(message.charAt(i))) {
				res.append(map.get(message.charAt(i)));
			}else{
				res.append(message.charAt(i));
			}
		}
		
				
		return res.toString();
	}
	public static void main(String[] args) {
		DecodeMessage ob= new DecodeMessage();
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		String res=ob.decodeMessage(key, message);
		System.out.println(res);
	}
}
