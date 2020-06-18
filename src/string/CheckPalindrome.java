package string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(CheckPalindrome.checkPalindrome(str));
	}
	
	public static boolean checkPalindrome(String str){
		int i=0;
		boolean ans = true;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				ans=false;
				return ans;
			}
		}
		return ans;
	}

}
