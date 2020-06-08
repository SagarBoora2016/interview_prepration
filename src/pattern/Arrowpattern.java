package pattern;

import java.util.Scanner;

public class Arrowpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n/2 + n%2);
		printReverse(n-n/2-n%2);
		
	}

	private static void printReverse(int n) {
		// TODO Auto-generated method stub
		printAllReverse(n,0);
	}

	private static void printAllReverse(int n, int line) {
		// TODO Auto-generated method stub
		if(line>=n) {
			return;
		}
		for(int i=0;i<n-line-1;i++) {
			System.out.print(" ");
		}
		int num = n-line;
		for(int i=0;i<num;i++){
			System.out.print("* ");
		}
		System.out.println();
		printAllReverse(n,line+1);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		printAll(n,0);
	}

	private static void printAll(int n, int line) {
		// TODO Auto-generated method stub
		if(line>=n) {
			return;
		}
		for(int i=0;i<line;i++) {
			System.out.print(" ");
		}
		int num = line+1;
		for(int i=0;i<num;i++){
			System.out.print("* ");
		}
		System.out.println();
		printAll(n,line+1);
	}

}
