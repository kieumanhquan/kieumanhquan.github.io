package Basic;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số nguyên: ");
            n = new Scanner(System.in).nextInt();
        }while (n < 2);

        System.out.print("Sau khi phân tích thành các số nguyên tố: ");
        int i = 2 ;
        System.out.print(n + " = ");
        while(n > 1) {
            if(n % i == 0) {
                System.out.print(i);
                if(n != i) {
                    System.out.print(" x ");
                }
                n /= i;
            }else {
                i++;
            }
        }
    }
}
