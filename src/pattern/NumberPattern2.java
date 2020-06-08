package pattern;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		printAll(n,0);
		printAllReverse(n,1);
	}

	public static void printAllReverse(int n, int line) {
		// TODO Auto-generated method stub
		if(line>=n) {
			return;
		}
		int toDelete = n-line-1;
		//toD=0
		int num = n;
		for(int i=0;i<n;i++) {
			if(toDelete<=0) {
				System.out.print(num + " ");
			}else {
				System.out.print(num + " ");
				num--;
				toDelete--;
			}
		}
		int toChange = n-line-1;
		for(int i=0;i<n-1;i++) {
			if(toChange+1 >= n-i && toChange>0) {
				num++;
				toChange--;
				System.out.print(num + " ");
			}else {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		printAllReverse(n,line+1);
	}

	public static void printAll(int n, int line) {
		// TODO Auto-generated method stub
		if(line>=n) {
			return;
		}
		int toDelete = line;
		//toD=0
		int num = n;
		for(int i=0;i<n;i++) {
			if(toDelete<=0) {
				System.out.print(num + " ");
			}else {
				System.out.print(num + " ");
				num--;
				toDelete--;
			}
		}
		int toChange = line;
		for(int i=0;i<n-1;i++) {
			if(toChange+1 >= n-i && toChange>0) {
				num++;
				toChange--;
				System.out.print(num + " ");
			}else {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		printAll(n,line+1);
	}
}
