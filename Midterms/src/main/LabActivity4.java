package main;

import java.util.Scanner;

public class LabActivity4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Tokens: ");
		String inputTokens = sc.nextLine();
		String[] tokens = inputTokens.split(" ");
		
		String[] correctSyntax = {"<data_type>", "<identifier>","<assignment_operator>","<value>","<delimiter>"};
		
		if(Checker(tokens, correctSyntax)) System.out.println("Syntax is Correct!");
		else System.out.println("Syntax is Error!");
		}
		

	public static boolean Checker(String[]tokens, String[] correctSyntax) {
		if(tokens == correctSyntax) return true;
		if(tokens == null || correctSyntax == null) return false;
		if(tokens.length != correctSyntax.length) return false;
		
		for(int i = 0; i < tokens.length; i++) {
			if(!tokens[i].equals(correctSyntax[i])) return false;
		} return true;
		
	}
}