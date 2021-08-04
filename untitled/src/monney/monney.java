package monney;

import java.util.Scanner;

public class monney {
    public static void main(String[] args) {
        long vnd = 23000;
        Scanner sc = new Scanner(System.in);
        long usd = sc.nextLong();
        long doitien = usd*vnd;
        System.out.println("số tiền của bạn là:"+ doitien);
    }

}
