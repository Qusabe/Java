import java.util.Scanner;
public class One {
    // Для настольной игры используются карточки с номерами от 1 до N.
    // Одна карточка потерялась. Найдите её, зная номера оставшихся каррточек
    // Дано число N, далее N-1 номер оставшихся карточек (различные числа от 1 до N)
    // Программа должна вывести номер потерянной карточки.
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