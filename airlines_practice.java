import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int t = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Input the number of aircraft and passengers for each test case
            int x = scanner.nextInt(); // number of aircraft
            int n = scanner.nextInt(); // number of passengers

            // Calculate the minimum number of planes needed
            int planesNeeded = (n + 99) / 100;

            // Calculate the additional planes needed
            int additionalPlanes = planesNeeded - x;

            // Output the result for each test case
            System.out.println(Math.max(0, additionalPlanes));
        }

	}
}
