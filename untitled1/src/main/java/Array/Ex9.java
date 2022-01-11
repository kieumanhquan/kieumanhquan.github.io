package Array;

import java.util.Scanner;

public class Ex9 {
    public static int[][] nhap(int m, int n, Scanner scanner){
        int x[][] = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }

    public static void xuat(int x[][]){
        for(int i = 0; i<x.length; i++){
            for(int j = 0; j < x.length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortColum(int[][] a, int n, int m){
        int i,j,temp;
        for(j=0 ; j<m ; j++){
            for(i=1 ; i<n ; i++){
                if(a[i-1][j]>a[i][j]){
                    temp= a[i-1][j];
                    a[i-1][j]= a[i][j];
                    a[i][j]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        int [][] a;
        System.out.print("Nhập hàng ma trận A: ");
        m = scanner.nextInt();
        System.out.print("Nhập số cột ma trận A: ");
        n = scanner.nextInt();
        a = nhap(m,n,scanner);
        System.out.println("Ma trận A là: ");
        xuat(a);
        sortColum(a,m,n);
        System.out.println("Sau khi sắp xếp là: ");
        xuat(a);

    }
}
