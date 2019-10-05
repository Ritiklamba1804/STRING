package stringHandling;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String inputString = sc.nextLine();
        System.out.println("Enter Character For which you want to index ");
        String input = sc.next();
        System.out.println(inputString.indexOf(input));

    }
}

