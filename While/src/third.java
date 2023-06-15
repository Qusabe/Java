import java.util.Scanner;

public class third {
    // Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель,
    //отличный от 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=2; i<=n;i++) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
