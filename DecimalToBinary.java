package testpackage1;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decnum=24, quot, i=1;
		
        int binarynum[] = new int[100];
        
        quot = decnum;
		
        while(quot != 0)
        {
            binarynum[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Equivalent Octal Value of " + decnum + " is :\n");
        for(int j=i-1; j>0; j--)
        {
            System.out.print(binarynum[j]);
        }

	}

}
