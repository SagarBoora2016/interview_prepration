package pattern;

import java.util.Scanner;

public class Number_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    print(x);
	}
	public static void print(int n){
	    printAll(n,0);
	}
	private static void printAll(int n, int line) {
		// TODO Auto-generated method stub
		if(n==line) {
			return;
		}
		int num = 1;
		for(int i=n-line-1;i<n;i++) {
			System.out.print(num++);
		}
		for(int i=0;i<n-line-1;i++) {
			System.out.print(" ");
		}
		for(int i=0;i<n-line-1;i++) {
			System.out.print(" ");
		}
		num--;
		for(int i=n-line-1;i<n;i++) {
			System.out.print(num--);
		}
		System.out.println();
		printAll(n,line+1);
	}
}
