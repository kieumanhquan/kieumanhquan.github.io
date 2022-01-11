package Basic;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Các cặp số nguyên tố trong khoảng [ " + a + ", " + b + " ] là: ");
        for (int i = a; i <= b; i++){
            for (int j = a + 1; j <= b; j++){
                if(ucln( i, j) == 1){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    private static int ucln(int a, int b) {
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
}

