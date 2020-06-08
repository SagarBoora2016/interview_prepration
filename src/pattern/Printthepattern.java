package pattern;

import java.util.Scanner;

public class Printthepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		// TODO Auto-generated method stub
		print(n,1);
		printAll(n,n-n%2);
		
	}

	public static void printAll(int n, int line) {
		// TODO Auto-generated method stub
		if(line<=0) {
			return;
		}
		int st = (line-1)*n +1;
		for(int i=0;i<n;i++) {
			System.out.print(st + " ");
			st++;
		}
		System.out.println();
		printAll(n,line+-2);
	}

	private static void print(int n, int line) {
		// TODO Auto-generated method stub
		if(line>n) {
			return;
		}
		int st = (line-1)*n +1;
		for(int i=0;i<n;i++) {
			System.out.print(st + " ");
			st++;
		}
		System.out.println();
		print(n,line+2);
	}
}
