import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
    
    // First line takes T as input test case number
    int T = sc.nextInt();
    sc.nextLine();
    
    // Defining for each test case
    for (int i = 0; i < T; i++) {
    // Each case takes two inputs a and b as integer
    String temp = sc.nextLine();
    String temp2 [] = temp.split(" ");
    
    int a = Integer.parseInt(temp2[0]);
    int b = Integer.parseInt(temp2[1]);
    
    // Calculate a + b and store as c
     int c = a + b;
    
    // Conditional and Result
    String result = c < 3 ? "1" : c <= 10 ? "2" : c <= 60 ? "3" : "4";
    
    System.out.println(result);
      
    // 1) Bullet if a + b < 3
    // 2) Blitz if 3 ≤ a + b ≤ 10
    // 3) Rapid if 11 ≤ a + b ≤ 60 
    // 4) Classical if 60 < a + b
     }
    }
}
