package string;

import java.util.Scanner;

public class CountWords {

static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(CountWords.countWords(str));
	}
	public static int countWords(String str){
		
		String arr[] = str.split(" ");
		return arr.length;

	}

}
