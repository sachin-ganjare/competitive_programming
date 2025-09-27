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
            int X = Integer.parseInt(allinput[0]);
            int Y = Integer.parseInt(allinput[1]);
            if( X*10 >= Y ){
                System.out.println("CLOTH");
            } else {
                System.out.println("DISPOSABLE");
            }
        };

        // 		 // Code to Display result
        // 		 System.out.println(result);

    }
}
