import java.util.Scanner;

public class First {
    // Пользователь с клавиатуры вводит действительные числа до 0. Необходимо вычислить их
    // среднее арифметическое. Гарантируется, что он введёт хотя бы 1 ненулевое число
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0, n = -1;
        double srednee;
        int sum = 0;
        while (true) {
            n = scan.nextInt();
            if (n == 0)
                break;
            count++;
            sum += n;
        }
        srednee = sum/count;
        System.out.println(srednee);
    }
}