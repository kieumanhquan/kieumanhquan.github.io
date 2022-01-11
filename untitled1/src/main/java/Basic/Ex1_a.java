package Basic;

import java.util.Scanner;

public class Ex1_a {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        if(n % 2 == 0){
            calculateEvenNumber(n);
        }
        else{
            calculateOddNumber(n);
        }
    }

    private static void calculateEvenNumber(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2){
            sum += i;
        }
        System.out.println("Tổng các số chẵn  là: " + sum);
    }

    private static void calculateOddNumber(int n) {
        int sum=0;
        for (int i = 1; i <= n; i += 2){
            sum += i;
        }
        System.out.println("Tổng các số lẻ  là: " + sum);
    }
}
