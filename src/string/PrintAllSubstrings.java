package string;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		PrintAllSubstrings.printSubstrings(str);
	}
	
	public static void printSubstrings(String str){
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i, j+1));
			}
		}
		

	}
}
