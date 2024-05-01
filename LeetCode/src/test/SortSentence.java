package test;

public class SortSentence 
{
	public String sortSentence(String s) 
    {
		//is2 sentence4 This1 a3
		StringBuilder s1=new StringBuilder();
		char n='9';
		while(n<='9' && n>'0') {
			for(int i=0;i<s.length();i++) {
				//System.out.println(n);
				if(s.charAt(i)==n) { //i=12
					for(int j=i-1;j>=0 && s.charAt(j)!=' ';j--) {
						s1.append(s.charAt(j));
					}
//					if(s.charAt(i)!='1')
					s1.append(" ");
					//System.out.println(s1.reverse().toString());
				}
			}
			n--;
		}
		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='4') { //i=12
//				for(int j=i-1;j>=0 && s.charAt(j)!=' ';j--) {
//					s1.append(s.charAt(j));
//				}
//				s1.append(" ");
//				//System.out.println(s1.reverse().toString());
//			}
//		}
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='3') { //i=12
//				for(int j=i-1;j>=0 && s.charAt(j)!=' ';j--) {
//					s1.append(s.charAt(j));
//				}
//				s1.append(" ");
//				//System.out.println(s1.reverse().toString());
//			}
//		}
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='2') { //i=2 j=1
//				for(int j=i-1;j>=0 && s.charAt(j)!=' ';j--) {
//					s1.append(s.charAt(j));
//				}
//				s1.append(" ");
//				//System.out.println(s1.reverse().toString());
//			}
//		}
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='1') { //i=19
//				for(int j=i-1;s.charAt(j)!=' ';j--) {
//					s1.append(s.charAt(j));
//				}
////				s1.append(" ");
//				//System.out.println(s1.reverse().toString());
//			}
//		}
		
        return s1.reverse().toString().trim();
    }
	public static void main(String[] args) {
		SortSentence ob = new SortSentence();
		String res=ob.sortSentence("is2 sentence4 This1 a3");
		System.out.println(res);
	}
}
