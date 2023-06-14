import java.util.Scanner;
public class Five {
    //Уравнение 1
    // Вводятся два целых числа: a и b - коэффициенты лин.уравнения
    // a*x + b = 0. Определите количество его корней. Вам достаточно ввести одно целое число -
    // кол-во корней кв. уравнения. Если корней бесконечно много, то выведите строку "inf"
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        if (a != 0) {
            System.out.println("Выходные данные: 1");
        } else if (a == b & a == 0) {
            System.out.println("Выходные данные: inf");
        } else if (a == 0 & b != 0) {
            System.out.println("Выходные данные: 0");
        }

    }
}
