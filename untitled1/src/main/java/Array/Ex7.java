package Array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử mảng n là: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        inputArray(a, n);
        longestWay(a, n);
    }

    private static void longestWay(int[] a, int n) {
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    b[i]++;
                }
                if (a[j] > a[j + 1]) {
                    break;
                }
            }
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("Đường chạy dài nhất có độ dài: "+ max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                System.out.println("Tại vị trí: "+ (i + 1));
            }
        }
    }

    private static void inputArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " là: ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }

}
