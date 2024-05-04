package test;

public class ReversePrefix 
{
    public static String reversePrefix(String word, char ch) {
    	int occ=word.indexOf(ch);
    	StringBuilder sb= new StringBuilder(word.substring(0,occ+1)).reverse();
        if(occ<word.length() && occ>0) {
        	sb.append(word.substring(occ+1));
        	return sb.toString();
        }
        return word;
    }
    public static void main(String[] args) {
		String word="abcdefd"; 
		char ch = 'd';
		String res=reversePrefix(word, ch);
		System.out.println(res);
	}
}
