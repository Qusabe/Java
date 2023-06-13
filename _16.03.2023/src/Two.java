import java.util.Scanner;
public class Two {
    // Программа запрашивает два числа n и x. Необходимо составить программу,
    // которая будет прибавлять число х само к себе до тех пор, пока
    // сумма не станет больше либо равна n. Выведите полученную сумму
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x = scan.nextInt();
        int cache = x;
        while (x < n)
        {
            x += cache;
        }
        System.out.println(x);
    }
}
