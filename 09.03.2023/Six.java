import java.util.Scanner;
public class Six {
    // Вводятся три целых числа: a,b,c - коэффициенты квадратного уравнения (а!=0).
    // определите кол-во его корней. Вам достаточно вывести одно целое число - кол-во корней
    // квадратного уравнения
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        double diskr = Math.pow(b, 2) - 4 * a * c;
        if (diskr > 0)
            System.out.println(2);
        if (diskr < 0)
            System.out.println(0);
        if (diskr == 0)
            System.out.println(1);
    }
}
