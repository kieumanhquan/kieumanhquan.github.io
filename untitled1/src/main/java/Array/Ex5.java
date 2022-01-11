package Array;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng a: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập số lượng phần tử mảng b: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số p: ");
        int p = new Scanner(System.in).nextInt();
        int[]a = new int[n];
        int[]b = new int[m];
        System.out.println("Nhập mảng a: ");
        inputArray(a,n);
        System.out.println("Nhập mảng b: ");
        inputArray(b,m);
        if (p>=0 && p<=n){
            outArray(a,0,p);
            outArray(b,0,m);
            outArray(a,p,n);
        }
    }

    private static void outArray(int[] a, int d, int c) {
        for (int i = d; i<c; i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void inputArray(int[] a, int n) {
        for (int i=0; i<n; i++){
            a[i] = new Scanner(System.in).nextInt();
        }
    }
}
