import java.util.Scanner;
public class Four {
    // "Високосный год"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
