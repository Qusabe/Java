import java.util.Scanner;
public class Seven {
    // Вводятся три целых числа. Необходимо определить, существует ли
    // треугольник с такими сторонами.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if ((a + b) > c) {
            if ((a + c) > b)
                if ((b + c) > a)
                    System.out.println("yes");
        }
        else
            System.out.println("No");
    }
}
