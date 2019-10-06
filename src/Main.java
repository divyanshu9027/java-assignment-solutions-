import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars:\t");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + "\t");
        }
    }
}