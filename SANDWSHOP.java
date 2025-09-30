import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    // your code goes here 
	    int sand_sold;
	    int sandA_cost;
	    int sandB_cost;
	    int profit;
	    Scanner sc = new Scanner(System.in);
	     sand_sold = sc.nextInt();
	     sandA_cost = sc.nextInt();
	     sandB_cost = sc.nextInt();
	     
	    int total_cost = sandB_cost + sandA_cost;
	    int total_sell = sand_sold;
	   
	    profit = total_sell - total_cost;
	    System.out.print(profit);

	}
}
