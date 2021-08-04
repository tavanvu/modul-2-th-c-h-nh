import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        System.out.println("nhap vao 1 nam");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean check = false;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0)) {
            check = true;
            System.out.println("nam nay la nam nhuan");
        } else {
            System.out.println("nam nay k phai nam nhuan");

        }
    }
}
