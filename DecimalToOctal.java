package testpackage1;

public class DecimalToOctal {
	public static void main(String []args)
	{
		int decnum=50, quot, i=1;
		
        int octnum[] = new int[100];
        
        quot = decnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Equivalent Octal Value of " + decnum + " is :\n");
        for(int j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
	}

}
