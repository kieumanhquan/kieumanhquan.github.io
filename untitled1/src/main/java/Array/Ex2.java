package Array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử có trong mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int [n];
        inputArray(a, n);
        System.out.println("Mảng sau khi nhập:");
        ouputArray(a, n);
        System.out.println("Mảng sau khi sắp xếp:");
        sortArrayA(a, n);
        ouputArray(a, n);
    }

    private static void inputArray(int[] a, int n) {
        for (int i = 0; i < n; i++){
            System.out.print("Nhập số thứ "+ (i + 1) +" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    private static void sortArrayA(int[] a, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    private static void ouputArray(int[] a, int n) {
        System.out.print("[ ");
        for ( int i = 0; i <= n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    }
