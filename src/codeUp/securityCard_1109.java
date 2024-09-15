package codeUp;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class securityCard_1109 {
    public static void securityCard (){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int age = scan.nextInt();
        String code = scan.next();
        String securityCode = scan.next();

        System.out.format("%s\n",name);
        System.out.format("%d\n",age);
        System.out.format("%s\n",code);
        System.out.format("%s",securityCode);
    }
}
