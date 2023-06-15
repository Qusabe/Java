import java.util.Scanner;

public class Fifth {
    // В первый день спортсмен пробежал х км, а затем каждый день увеличивал пробег на 10% от предыдушего
    // По данному числу у определите номер дня, на который пробег спортсена составит не менее у км.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble(), y = scan.nextDouble();
        int count = 1;
        while (x < y) {
            x += x*0.1;
            count++;
        }
        System.out.println(count);
    }
}
