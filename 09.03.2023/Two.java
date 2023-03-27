import java.util.Scanner;

public class Two {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int min = scan.nextInt();
        int watches = scan.nextInt();
        int seconds = hours * 3600 + min * 60;
        if (watches <= seconds)
            System.out.println("Успел");
        else
            System.out.println("Опоздал");
    }
}
