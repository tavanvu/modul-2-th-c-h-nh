package BT;

import java.sql.Array;
import java.util.Scanner;

public class daonguocvitri {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("moi ban nhap kích thưởng mảng");
            size = sc.nextInt();
            if (size>20);
        }while (size>20);
        array =new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhập giá trị cho mảng"+(i+1));
            array[i] =sc.nextInt();
            i++;
        }
        for (int j =0;j< array.length;j++){
            System.out.println(array[j]);
        }
        for (int j=0;j< array.length/2;j++){
            int check =array[j];
            array[j] =array[size-1-j];
            array[size-1-j]=check;
        }
        System.out.println("đảo ngược mảng");
        for (int j=0;j< array.length;j++){
            System.out.println(array[j]);
        }
    }
}
