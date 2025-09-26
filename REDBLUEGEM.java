import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

		// Input Template
	 	Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split(" ");
    	 int R = Integer.parseInt(b[0]);
    	 int B = Integer.parseInt(b[1]);
    	 int P = Integer.parseInt(b[2]);
    	 int Q = Integer.parseInt(b[3]);
		 
		 int calc1 = R * P;
		 int calc2 = B * Q;
		 int result;
		 
		 if (calc1 > calc2)
		        result = calc1;
		  else 
		        result = calc2;
		 
		 
		 
		 // Code to Display result
		 System.out.println(result);

	}
}
