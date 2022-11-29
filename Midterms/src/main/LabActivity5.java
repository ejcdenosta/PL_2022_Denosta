package main;

import java.util.Scanner;

public class LabActivity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Expression: ");
        String userIn = sc.nextLine();
        String[] tokens = userIn.split(" ");
        String[] dataType = {"int", "String", "double"};

        //Incomplete
        for(int i = 0; i < userIn.length();i++){
            if(tokens[0].contains("int") && tokens[tokens.length-1].endsWith(";")){
                System.out.println("Semantically Correct!");
                break;
            } else if(tokens[0].contains("String") && tokens[tokens.length-1].endsWith(";")){
                System.out.println("Semantically Correct!");
                break;
            } else if(tokens[0].contains("double") && tokens[tokens.length-1].endsWith(";")){
                System.out.println("Semantically Correct!");
                break;
            } else System.out.println("Semantically Incorrect!");
        }
    }
}
