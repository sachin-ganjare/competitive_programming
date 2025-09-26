import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Split input in two variables
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split(" ");
		 int X = Integer.parseInt(b[0]);
		 int Y = Integer.parseInt(b[1]);
		 
		 int nuggets_no = X;
		 int star_pieces = Y;
		 int result = star_pieces*9800 + nuggets_no*5000;
		 
		 
		 // Code to Display result
		 System.out.println(result);

	}
}
