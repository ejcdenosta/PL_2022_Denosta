package main;

import java.util.Scanner;

public class LabActivity1 {

	//Printing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter word/phrase : ");
		String phrase = sc.nextLine();
		
		if(checkPalindrome(phrase)) System.out.println(phrase + " is palindrome");
		else System.out.print(phrase + " is NOT a palindrome");
		
		sc.close();
	} 
	
	
	//Checker
	static boolean checkPalindrome(String check) {
		
		int left = 0;
		int right = check.length() - 1;
		
		check = check.toLowerCase();
		
		while(left <= right) {
			char fromLeft = check.charAt(left);
			char fromRight = check.charAt(right);
			
			//Check left char
			if(!(fromLeft >= 'a' && fromLeft <= 'z')) left++;
			
			//Check right char
			else if(!(fromRight >= 'a' && fromRight <= 'z')) right--;
			
			//Check char ==
			else if(fromLeft == fromRight) {
				left++;
				right--;
			}
			
			//characters !=
			else return false;
		}
		//characters ==
		return true;
	}
}
