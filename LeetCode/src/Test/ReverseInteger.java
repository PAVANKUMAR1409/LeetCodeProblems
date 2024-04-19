package Test;

public class ReverseInteger 
{
	public static void main(String[] args) {
		ReverseInteger ob= new ReverseInteger();
		System.out.println(ob.reverse(-123));
	}
	public int reverse(int x)  //123
    {
		int num=Math.abs(x);
        int rev=0,y=0;
        while(num!=0)
        {
            y=num%10; //1
            rev=(rev*10)+y; //321
            num=num/10; //0
        }
        return x<0?(-rev):rev;
    }
}	
