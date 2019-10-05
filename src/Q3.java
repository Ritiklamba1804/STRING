package stringHandling;

import java.util.Scanner;

public class Q3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = "";

        System.out.println("Enter the string");

        String st = sc.nextLine();

        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++)

        {

            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')

            {

                ch[i]='*';

            }

        }

        for (int i = 0; i < ch.length; i++) {

            System.out.print(ch[i]);

        }

    }
}