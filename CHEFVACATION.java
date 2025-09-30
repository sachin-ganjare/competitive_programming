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
    // Split y[] into X,Y,Z respectively
     int X,Y,Z;
     X = Integer.parseInt(y[0]); // Family
     Y = Integer.parseInt(y[1]); // Friends
     Z = Integer.parseInt(y[2]); // Z Days
     // Answer
     String ans = (X+Y > Z)? "NO" : "YES";
     System.out.println(ans);

    }
}
}
