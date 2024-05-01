package test;

public class FizzBuzz {
	public static void main(String[] args) {
		int n=15;
		for(int i=1;i<=n;i++) {
			System.out.println((i%5==0 && i%3==0)?"FizzBuzz":(i%5==0)?"Fizz":(i%3==0)?"Buzz":i);
		}
	}
}
