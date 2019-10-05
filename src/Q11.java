package stringHandling;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String");

        String inputString = sc.nextLine();

        System.out.println("Enter Character For which you want to index ");

        String input = sc.next();

        for(int i=0;i<inputString.length();i++){

            if (input.charAt(0)==inputString.charAt(i)){

                System.out.println(i);

            }
        }

    }
}
}