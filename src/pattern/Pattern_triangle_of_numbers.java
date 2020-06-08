package pattern;

import java.util.Scanner;

public class Pattern_triangle_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    print(x);
	}
	public static void print(int n){
	    printAll(n,0);
	}
	public static void printAll(int n,int line){
	    if(line>=n){
	        return;
	    }
		for(int i=0;i<n-line-1;i++){
	        System.out.print(" ");
	    }
	    int num = line+1;
	    for(int i=n-line-1;i<n;i++){
	        System.out.print(num);
	        num++;
	    }
	    num--;
	    num--;
	    while(num!=line && num>line){
	        System.out.print(num);
	        num--;
	    }
	    System.out.println();
	    printAll(n,line+1);
	}
}
