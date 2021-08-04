package bmi;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight,height,bmi;
        System.out.println("nhaap vao can nag");
         weight =sc.nextFloat();
        System.out.println("nhap chieu cao");
         height = sc.nextFloat();
        bmi = weight/height*2;
        if (bmi < 18.5){
            System.out.println("underweith");
        } else if (bmi >= 18.5 && bmi <=25){
            System.out.println("norma");
        }else if (bmi >= 25 && bmi <=30){
            System.out.println("oveweghit");
        }else if (bmi >= 30){
            System.out.println("base");
        }else {
            System.out.println("beo");
        }
    }
}
