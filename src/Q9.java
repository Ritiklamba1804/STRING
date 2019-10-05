package stringimplementation;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter THe String");

        String input = sc.nextLine();

        int lowerWeight=0;

        int upperWeight=0;

        for(int i=0;i<input.length();i++){

            if(input.charAt(i)>='a'&&input.charAt(i)<='z'){

                int u=(int)input.charAt(i);

                lowerWeight+=u;

            }else if(input.charAt(i)>='A'&&input.charAt(i)<='Z'){

                int w=(int)input.charAt(i);

                upperWeight+=w;

            }

        }

        int absoluteWeight=upperWeight-lowerWeight;

        if (absoluteWeight<0){

            System.out.println("absoluteWeight = "+absoluteWeight*(-1));

        }else

            System.out.println("absoluteWeight = "+absoluteWeight);

    }

}