package testpackage1;

public class DecimalToHex {
	public static void main(String []args)
	{
		int decnum=45, rem;
        String hexdecnum="";
        
        /* digits in hexadecimal number system */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(decnum>0)
        {
            rem = decnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            decnum = decnum/16;
        }
		
        System.out.print("Equivalent Hexadecimal Value of " + decnum + " is :\n");
        System.out.print(hexdecnum);
	}

}
