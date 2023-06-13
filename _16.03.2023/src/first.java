import java.util.Scanner;
public class first {


    // Пользователь вводит натуральные числа по одному на каждой строк
    // Когда ему надоедает, то он вводит 0. Найти сумму введённых чисел
    public static void main(String[] args)
    {
       int sum = 0;
       Scanner scan = new Scanner(System.in);
       int i = -1;
       while (i != 0)
        {
            i = scan.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}