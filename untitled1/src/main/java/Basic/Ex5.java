package Basic;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        int n = sc.nextInt();
        int tong  =0;
        int sodu;
        while(n > 0) {
            sodu = n % 10;
            n = n / 10;
            tong += sodu;
        }
        System.out.println("Tổng : " + tong);
    }
}
