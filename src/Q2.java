package stringHandling;

import java.util.Scanner;
public class Q2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the String");

            String input=sc.nextLine();

            int index1=sc.nextInt();

            int index2=sc.nextInt();

            System.out.println(input.substring(index1,index2));



        }

    }
