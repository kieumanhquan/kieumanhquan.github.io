package Array;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        listArray();
    }

    public static void listArray(){
        Scanner sc = new Scanner(System.in);
        int n, b;
        System.out.print("Nhập số phần tử trong mảng n:");
        n = sc.nextInt();
        System.out.print("Nhập X:");
        b = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhập phần tử " + (i + 1) + " trong mảng n:");
            a[i] = sc.nextInt();
        }
        int check = Math.abs(a[0] - b);
        int p = 0;
        for(int i = 1; i < n - 1; i++)
        {
            if(check > Math.abs(a[i] - b)){
                check = Math.abs(a[i] - b);
                p = i;
            }
        }
        System.out.println("Số nguyên tố gần X nhất là: " + a[p] + " ở vị trí "+ (p + 1));
    }
}
