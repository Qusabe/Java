import java.util.Scanner;
public class Ten {

    // Перевод арабских цифр в римские. Сделал через if, потому что помнил, что вы просили именно так
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int arab = scan.nextInt();
        if (arab == 100)
            System.out.println("C");
        if (arab / 10 == 0) {
            if (arab == 1)
                System.out.println("I");
            if (arab == 2)
                System.out.println("II");
            if (arab == 3)
                System.out.println("III");
            if (arab == 4)
                System.out.println("IV");
            if (arab == 5)
                System.out.println("V");
            if (arab == 6)
                System.out.println("VI");
            if (arab == 7)
                System.out.println("VII");
            if (arab == 8)
                System.out.println("VIII");
            if (arab == 9)
                System.out.println("IX");
        }

        else {
            String f_r = "", s_r = ""; // римские цифры числа
            int first = arab / 10;

            if (first == 1)
                f_r = "X";
            if (first == 2)
                f_r = "XX";
            if (first == 3)
                f_r = "XXX";
            if (first == 4)
                f_r = "XL";
            if (first == 5)
                f_r = "L";
            if (first == 6)
                f_r = "LX";
            if (first == 7)
                f_r = "LXX";
            if (first == 8)
                f_r = "LXXX";
            if (first == 9)
                f_r = "XC";
            int second = arab % 10;
            if (second == 1)
                s_r = "I";
            if (second == 2)
                s_r = "II";
            if (second == 3)
                s_r = "III";
            if (second == 4)
                s_r = "IV";
            if (second == 5)
                s_r = "V";
            if (second == 6)
                s_r = "VI";
            if (second == 7)
                s_r = "VII";
            if (second == 8)
                s_r = "VIII";
            if (second == 9)
                s_r = "IX";
            String rimsk = (f_r + s_r);
            System.out.println(rimsk);
        }

    }
}
