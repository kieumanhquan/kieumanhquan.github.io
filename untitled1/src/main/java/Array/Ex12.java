package Array;

import java.util.Scanner;

public class Ex12 {
    public static void nhapMaTran(int array[][], int n) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]: ");
                array[i][j] = scanner.nextInt();
            }

    }

    public static void inMaTran(int array[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
    public static int[][] xoayMaTran(int array[][], int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)//2
            for (int j = 0; j < n; j++) { //3
                temp[i][j] = array[j][n-1-i]; // 00 =
            }

        return temp;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = scanner.nextInt();

        int a[][] = new int[n][n] ;
        nhapMaTran(a, n);
        System.out.println("Ma tran vua nhap \n");
        inMaTran(a, n );
        int[][] temp ;
        temp =  xoayMaTran(a,n);
        System.out.println("xoay ma tran \n");
        inMaTran(temp,n);
    }
}
