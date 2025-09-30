import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
    
    // First input indicates number of test cases
    int T = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < T; i++) {
    // First and only first line of each input are six space-separated int
    String x = sc.nextLine();
    // Divide the input
    String y[] = x.split(" ");
    // Split y[] into G1,S1,B1,G2,S2,B2 respectively
     int G1,S1,B1,G2,S2,B2;
     G1 = Integer.parseInt(y[0]);
     S1 = Integer.parseInt(y[1]);
     B1 = Integer.parseInt(y[2]);
     G2 = Integer.parseInt(y[3]);
     S2 = Integer.parseInt(y[4]);
     B2 = Integer.parseInt(y[5]);
     // Country one
      int C1 = G1+S1+B1;
      int C2 = G2+S2+B2;
      int result = (C1>C2)?(1):(2); 
     System.out.println(result);
  }
}
}
