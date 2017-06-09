package testpackage1;

public class TestClass {

	public static void main(String[] args) {
		int n=5;
		
		System.out.println("======== Program - 1 ========\n");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n==== End of Program - 1 ====\n");
		
		System.out.println("\n======== Program - 2 ========\n");		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n==== End of Program - 2 ====\n");
		
		System.out.println("\n======== Program - 3 ========\n");
		int no=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
		System.out.println("\n==== End of Program - 3 ====\n");
		
		System.out.println("\n======== Program - 4 ========\n");
		for(int i=1;i<=n;i++)
		{
			int num=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		System.out.println("\n==== End of Program - 4 ====\n");
		
		
		
		int k=0;
        
        for(int i=1; i<=n; i++)
        {
            for(int space=1; space<=(n-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
        
	}

}
