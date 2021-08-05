package BT;

import java.util.Scanner;

public class inhinh {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
       int a =sc.nextInt();
        for (i=1;i<=a;i++){
            for (j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
