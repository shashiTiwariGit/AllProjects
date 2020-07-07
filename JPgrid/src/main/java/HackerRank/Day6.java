package HackerRank;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		String s;

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		if (k > 11 || k < 1) {
			System.out.println("Invalid Input");

		} else {
			String[] input = new String[k];
			for (int i = 0; i < k; i++) {
				input[i] = scan.next();
			}
			scan.close();
			
			{

				for (int i = 0; i < k; i++) {
					s=input[i];
					if (s.length() > 10001 || s.length() < 2) {
						System.out.println("Invalid Input");
					} else {
						
						System.out.println(evenOddString(s));
					}

				}
			}

		}

	}

	public static String evenOddString(String s) {

		String[] a = s.split("");
		s = "";
		String even = "", odd = "";
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				even = even + a[i];
			} else {
				odd = odd + a[i];
			}
			s =odd  + " " +even ;
		}

		return s;
	}
}
