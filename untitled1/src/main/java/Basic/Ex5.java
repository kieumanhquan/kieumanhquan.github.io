package Basic;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên:");
        int n = sc.nextInt();
        int sum  =0;
        int surplus;
        while(n > 0) {
            surplus = n % 10;
            n = n / 10;
            sum += surplus;
        }
        System.out.println("Tổng các chữ số bằng: " + sum);
    }
}
