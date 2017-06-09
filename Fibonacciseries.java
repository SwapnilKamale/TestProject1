package testpackage1;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		int a=0, b=1, c=0, limit=10;
		
		System.out.println("Fibonacci series is:"+a+"\n"+b);
		
		c=a+b;
		
		limit=limit-2;
		
		while(limit>0)
		{
			System.out.println(c+" ");
			a=b;
			b=c;
			c=a+b;
			limit--;
		}
	}

}
