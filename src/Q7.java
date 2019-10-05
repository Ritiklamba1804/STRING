package stringHandling;
import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        int totalWeight=0;
        System.out.print("Total Weight=");
        for(int i=0;i<input.length();i++){
            int w=(int)input.charAt(i);
            totalWeight+=w;
            System.out.print(w);
            System.out.print("+");
        }
    }
}