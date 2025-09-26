import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int players, survived_players;
	    // Take input players and survived_players
	    String x = sc.nextLine();
	    String y[] = x.split(" ");
	    players = Integer.parseInt(y[0]);
	    survived_players = Integer.parseInt(y[1]);
	    int unit = 10000;
	    int prize_pool;
	    prize_pool = (players - survived_players) *10000;
	    System.out.println(prize_pool);

	}
}
