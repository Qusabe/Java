import java.util.Scanner;
public class Three {
    // Последовательность состоит из натуральных чисел и завершается числом 0.
    // Всего вводится не более 10000 чисел (не считая завершающего числа 0)
    // Определите, сколько элементов этой последовательности равны её наибольшему элементу
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int count = 0, max_n = -1000;
        for (int num = 1; num != 0; num = scan.nextInt())
        {
            if (max_n == num) count++;
            max_n = Math.max(max_n, num);
        }
        System.out.println(count);
    }
}
