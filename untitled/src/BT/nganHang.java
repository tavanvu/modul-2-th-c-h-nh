package BT;

import java.util.Scanner;

public class nganHang {
    public static void main(String[] args) {
        double monNey,interestRate =0;
        int moth = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so tháng");
        moth = sc.nextInt();
        System.out.println("moi ban nhap % lãi");
        interestRate = sc.nextDouble();
        System.out.println("moi ban nhap so tien muon gui");
        monNey = sc.nextDouble();
        double total=0;
        for (int i =1;i<= moth;i++){
            total += monNey*(interestRate/100)/12*moth;
            System.out.println("số tiên lãi là tháng"+i+":"+total);
        }

    }
}
