package string;

import java.util.Scanner;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReverseStringWordWise.reverseWordWise(input));
	}
	public static String reverseWordWise(String input) {
		// Write your code here
		String arr[] = input.split(" ");
		String ans = "";
		for(int i=arr.length-1;i>=0;i--) {
			ans = ans + arr[i];
			ans +=" ";
		}
		return ans;
	}
}
