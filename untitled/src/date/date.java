package date;

import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        System.out.println("nhập vào tháng bạn cần tìm:");
        Scanner sc = new Scanner(System.in);
        int month =sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("28,29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 12:
                System.out.println("có 31 ngày");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
                System.out.println("30 ngày");
                break;
        }
    }
}
