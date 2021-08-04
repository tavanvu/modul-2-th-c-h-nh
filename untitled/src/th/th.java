package th;

import java.util.Scanner;

public class th {
    public static void main(String[] args) {
        System.out.println("phương trình có dạng ax + b =c");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        float a = sc.nextFloat();
        System.out.println("nhap b");
        float b = sc.nextFloat();
        System.out.println("nhap c");
        float c = sc.nextFloat();
        if (a !=0){
            float answer = (c-b)/a;
            System.out.println("Equation pass with x = %f!\n"+answer);
        } else if (b==c){
            System.out.println("The solution is all x!");
        }else {
            System.out.println("pt vo nghiem");
        }
    }
}
