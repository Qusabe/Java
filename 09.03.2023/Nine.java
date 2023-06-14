import java.util.Scanner;
import java.lang.Math;
public class Nine {
    // На сковородку одновременно можно положить k котлет.
    // Каждую котлету нужно с каждой стороны
    // обжаривать m минут непрерывно. За какое наименьшее
    // время удастся обжарить с обеих сторон n котлет?
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int k_per_pan = scan.nextInt(), min = scan.nextInt(), k_total = scan.nextInt();
        int time_p_pan = 2*min;
        int time = (int) Math.ceil(k_total/k_per_pan)*time_p_pan;
        System.out.println(time);
    }}

