package Basic;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int a;
        int b;
        do {
            System.out.println("Nhập số thứ nhất: ");
            a = new Scanner(System.in).nextInt();
            System.out.println("Nhập số thứ hai: ");
            b = new Scanner(System.in).nextInt();
        } while (a <= 0 || b <= 0);
        int s = a * b;
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất: "+ a);
        System.out.println("Bội chung nhỏ nhất: "+ s / a);
    }
}
