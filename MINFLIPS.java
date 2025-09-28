import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
    
      // Declare the variable for result
      int min_op;
      
      Scanner sc = new Scanner(System.in);    
      // Take number of Test cases 
      int T = sc.nextInt();
      sc.nextLine();
      
      // Operations for each of the Test Cases
      for (int i = 0; i < T; i++) {
          // Take input N denoting the length of the array
          int N = sc.nextInt();
          sc.nextLine();
          
          // Take array input
          String temp = sc.nextLine();
          String A[] = temp.split(" ");
          
          // Logic: Odd "N" will have answer -1; Even "N" will have Sum/2
          int sum = 0;
          for (String j: A) {
            sum += Integer.parseInt(j);
          }
          
          if (N%2==0) {
            min_op = Math.abs(sum)/2;
          } else {
            min_op = -1;
          }
          // Output the minimum number of operations to make sum of array equal to zero, if possible
          System.out.println(min_op);
      }
 
    }
}
