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
            
            double N_old = Double.parseDouble(allinput[0]); //order online
            double M = Double.parseDouble(allinput[1]);  // eat at restaurant
            String result;
            double N;
            
            N = N_old - (N_old * 0.1);
            if(N < M) {
                result = "ONLINE";
            }
            else if(N > M) {
                result = "DINING";
            }
            else {
                result = "EITHER";
            }
            System.out.println(result);
        };

    }
}
