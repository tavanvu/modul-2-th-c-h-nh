package th1;

import java.util.Scanner;

public class date1 {
    public static void main(String[] args) {
//        float with;
//        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp vào chiều rộng");
        float with = sc.nextFloat();
        System.out.println("nhập vào chiều cao");
        float height = sc.nextFloat();
        float area = with*height;
        System.out.println(area);
        }
    }
