import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i =sc.nextInt();
        int j =sc.nextInt();
        System.out.println(s);
        System.out.println(s.substring(i,j));
    }
}