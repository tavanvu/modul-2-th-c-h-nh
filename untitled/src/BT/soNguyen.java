package BT;

import java.util.Scanner;
import java.lang.Math;

public class soNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số");
        int number = sc.nextInt();
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < number - 1; i++) {
                if (i % 2 == 0) {
                    check = false;
                }
            }
        }
        if (check=true){
            System.out.println("day la so nguyen to");
        }else {
            System.out.println("k phai so nguyen to");
        }
    }
}
