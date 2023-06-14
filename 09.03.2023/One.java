import java.util.Scanner;

public class One {
    // "Красная Шапочка"
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        if (amount % 2 == 0) {
            int delivered = amount / 2;
            System.out.println(delivered);
        }
        else {
            System.out.println("Error");
        }
    }
}
