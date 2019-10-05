package stringHandling;

import java.util.Scanner;

public class Q5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String Value : ");

        String stringInput = sc.nextLine();

        System.out.println("Enter Value of subString : ");

        String subString = sc.nextLine();

        System.out.println("Enter the  Value to be Replaced with   : ");

        String subStringForReplacement = sc.nextLine();

        String newString = stringInput.replace(subString,subStringForReplacement);

        System.out.println("New String : " + newString);

    }
}