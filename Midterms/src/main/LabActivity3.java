package main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LabActivity3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Source Language : ");
		String input = sc.nextLine();
		
		String[] strArray = toArray(input, " ");
		
		String[] dataType = {"int", "double", "char", "String"};
		
		if(strArray != null) {
			
			System.out.print("Output is : ");
			
			for(int i = 0; i < strArray.length; i++) {
				
				//Looks up the value in the dataType array
				if(strArray[i].equals(dataType[0]) || strArray[i].equals(dataType[1]) ||
						strArray[i].equals(dataType[2]) || strArray[i].equals(dataType[3]))
						System.out.print("<data_type>");

				else if(strArray[i].contains("=")) System.out.print("<assignment_operator>");

				else if((strArray[i].startsWith("\"") && strArray[i].contains("\"")) || 
						(strArray[i].startsWith("\'") && strArray[i].contains("\'")) ||
						(strArray[i].endsWith(";") || (strArray[i].matches("^[0-9_]+$")))) System.out.print("<value>");
				
				//Prints <identifier> if the String has no double quotes or numbers
				else if(strArray[i].matches("^[a-zA-Z_]+$")) System.out.print("<identifier>");
			}
			
			//Prints <delimiter> if token ends with semi-colon
			if(strArray[strArray.length-1].contains(";")) System.out.print("<delimiter>");

		} sc.close();
	}
	
	private static String[] toArray(String userInput, String delim) {
		
		String[] tokenArray = null;
		
		try {
			
			if(userInput == null || delim == null) return tokenArray;
			StringTokenizer st = new StringTokenizer(userInput, delim);
			tokenArray = new String[st.countTokens()];
			
			int countTokens = 0;
			while(st.hasMoreTokens()) tokenArray[countTokens++] = st.nextToken();	
			
		} catch(Exception e) {
			e.printStackTrace();
		} return tokenArray;
		
	}		
}