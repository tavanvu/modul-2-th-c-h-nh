package BT;

import java.util.Scanner;

public class uocsochunglonnhat {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a:");
        a =sc.nextInt();
        System.out.println("nhap vao so b:");
        b = sc.nextInt();
        a =Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.println("khonong có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
