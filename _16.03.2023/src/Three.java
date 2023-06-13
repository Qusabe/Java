import java.util.Scanner;
public class Three {

    // Программа запрашивает натуральное число n. Необходимо cоставить программу,
    // которая будет считывать целые числа до тех пор, пока их произведение не станет
    // больше либо равна n. Выведите через пробел количество выведенных чисел и их
    // произведение
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = -1, count = 0;
        while (n > i)
        {
            i = scan.nextInt();
            i *= i;
            count += 1;;
        }
        System.out.println(count + " " + i);
    }
}
