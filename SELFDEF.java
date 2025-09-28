import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
         Scanner sc = new Scanner(System.in);
      // Input the number of test cases
      int T = sc.nextInt();
      sc.nextLine();

      // Loop for each test case
      for (int i = 0; i < T; i++) {
        // Number of women
        int N = sc.nextInt();
        sc.nextLine();
        
        // Space separated N integers input, say X[]
        // int X[] = new int[N];
        String Xa = sc.nextLine();  
        String X[] = Xa.split(" ");
        
        // Loop & Conditional to check age is between 10 & 60
         int eligible_women = 0;
         
         for(String j: X){
          if(Integer.parseInt(j)>=10 && Integer.parseInt(j)<=60) 
                eligible_women++;
        }
        // Display Result
        System.out.println(eligible_women);
        
      }

    }
}
