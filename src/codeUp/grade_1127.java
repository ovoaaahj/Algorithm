package codeUp;

import java.util.Scanner;

public class grade_1127 {
    public static void grade(){
        Scanner scan = new Scanner(System.in);
        String a1 = scan.next();
        String a2 = scan.next();
        String b1 = scan.next();
        String b2 = scan.next();
        String c1 = scan.next();
        String c2 = scan.next();

        float result = Float.parseFloat(a1)*Integer.parseInt(a2)+Float.parseFloat(b1)*Integer.parseInt(b2)+Float.parseFloat(c1)*Integer.parseInt(c2);

        System.out.format("%.1f",result);

    }
}
