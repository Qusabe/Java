import java.util.Scanner;
public class One {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во карточек ");
        int quantity = scan.nextInt(), sumNeeded = 0, sumGotten = 0;
        for (int i = 1; i<=quantity; i++) sumNeeded += i;
        System.out.println("Введите номера карточек");
        for (int i = 1; i<quantity;i++)
        {
            int number = scan.nextInt();
            sumGotten += number;
        }
        int missed = sumNeeded - sumGotten;
        System.out.println("Пропущенная карта: " + missed);
    }
}