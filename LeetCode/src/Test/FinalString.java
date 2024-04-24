package Test;

public class FinalString 
{
	 
	public String finalString(String s)
	 {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='i') {
				s1+=s.charAt(i);
				//System.out.println(s1);
			}
			else {
				StringBuilder sb= new StringBuilder(s1);
				s1=sb.reverse().toString();
				//System.out.println(s1);
			}	
		}
		return s1; 
	 }
	 public static void main(String[] args) {
		 FinalString ob= new FinalString();
		 String s="poiinter";
		 String res=ob.finalString(s);
		 System.out.println(res);
	}
}
