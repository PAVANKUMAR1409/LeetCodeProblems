package test;

public class CountAsterisks 
{
	 public int countAsterisks(String s) 
	 {
		 System.out.println(s.length());
		 int count=0, a=0;
		 for(char ch:s.toCharArray()) {
			 if(ch=='|')a++;
			 if(a%2==0) {
				 if(ch=='*')count++;
			 }
		 }
		 
		 return count;
	 }
	public static void main(String[] args) {
		 CountAsterisks ob= new CountAsterisks();
		 int count=ob.countAsterisks("l|*e*et|c**o|*de|");
		 System.out.println(count);
	}
}
