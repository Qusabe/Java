import java.util.Scanner;
public class Eight {
    // "Слон". Требуется определить, бьёт ли слон, стоящий на клетке с указанными координатами), фигуру,
    // стоящую на другой указанной клетке
    public static void main (String[] args)
    {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
       if ((a + b == c + d) || (a - b == c - d))
           System.out.println("Yes");
       else
        System.out.println("NO");
    }
}
