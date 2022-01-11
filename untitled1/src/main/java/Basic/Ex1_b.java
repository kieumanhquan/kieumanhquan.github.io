package Basic;

import java.util.Scanner;

public class Ex1_b {
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (float) 1 / i;
        }
        System.out.println("Tổng các số là: " + sum);
    }
}
