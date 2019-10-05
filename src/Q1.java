package stringHandling;



import java.util.Scanner;



public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of String");

        String input = sc.nextLine();

        System.out.print("index:"+"\t");

        for(int i = 0;i<input.length();i++) {

            System.out.print(i+"\t");

        }



        System.out.println();

        System.out.print("chars:"+"\t");

        for(int i=0;i<input.length();i++){

            System.out.print(input.charAt(i)+"\t");



        }

    }

}

