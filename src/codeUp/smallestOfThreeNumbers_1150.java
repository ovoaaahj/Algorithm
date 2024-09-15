package codeUp;

import java.util.Scanner;

public class smallestOfThreeNumbers_1150 {
    public static void smallestOfThreeNumbers(){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());

        int result = a>b?(Math.min(b, c)):(Math.min(a, c));
        System.out.println(result);
    }
}
