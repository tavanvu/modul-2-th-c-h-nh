import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float with;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp vào chiều rộng");
        with = sc.nextFloat();
        System.out.println("nhập vào chiều cao");
        height = sc.nextFloat();
        float area = with*height;
        System.out.println(area);
        }
    }
