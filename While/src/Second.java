import java.util.Scanner;

public class Second {
    // Вводится 2 целых числа a и b ( a<= b). Необходимо вычислить кол-во
    // всех чисел кратных 3, но не кратных 5 от а до b
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i=a; i<=b; i++ )
            if (i % 3 == 0 && i % 5 != 0)
                count++;

        System.out.println(count);
    }
}
