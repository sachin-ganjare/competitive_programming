import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // Input Template
        Scanner sc = new Scanner(System.in);
        // Test cases
        int T = sc.nextInt();
        sc.nextLine(); // Consume newline character
        String[] test_cases = new String[T];
        //Input for each test_cases
        for (int i = 0; i < T; i++) {
            test_cases[i] = sc.nextLine();
            // Operation for each input
            String[] allinput = test_cases[i].split(" ");
            
            int N = Integer.parseInt(allinput[0]); // Nominated_Members
            int M = Integer.parseInt(allinput[1]); // Total_Voters
            
            int min_votes; // For Strict Majority Win
            
            // Logic
            min_votes = M/2 +1;
            
            System.out.println(min_votes);
        };

    }
}
