import java.util.Scanner;

public class Fourth {
    // Дано натуральное число. Напишите программу,
    // вычисляющую сумму цифр числа N
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
    }
}
