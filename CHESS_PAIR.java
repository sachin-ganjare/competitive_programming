import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    { 
    Scanner sc = new Scanner(System.in);
    
    // T number of test cases
    int T = sc.nextInt();
    sc.nextLine();
    
    // Operations for each test case
    for (int i = 0; i < T; i++) {
    
    // Take input
    String input2 = sc.nextLine();
    String input1[] = input2.split(" ");
    // 2N indicates Number of players
    int N = Integer.parseInt(input1[0]);
    int N2 = N*2;
    // X indicates Rated players
    int X = Integer.parseInt(input1[1]);
    
    // Logic:
    int X_un = N2 - X;
    
    int extra_rated = X - X_un;
    int min_rated;
    
    if (extra_rated > 0)
         min_rated = extra_rated;    
    else
          min_rated = 0;
        
    System.out.println(min_rated);
    
    }
}
}
