package Array;

import java.util.Scanner;

public class Ex8 {
    public static void inIt() {
        int[][] a, b, c;
        int m, n, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị m : ");
        m= sc.nextInt();
        System.out.print("Nhập giá trị n : ");
        n = sc.nextInt();
        System.out.print("Nhập giá trị k : ");
        k = sc.nextInt();

        a = nhap(m, n);
        b = nhap(n, k);

        System.out.println("Ma trận A:");
        xuat(a);
        System.out.println("Ma trận B:");
        xuat(b);
        System.out.println("Tích 2 ma trận là: ");
        c= tich(a, b);
        xuat(c);
    }

    //tính tích hai ma trận
    public static int [][] tich(int[][] a, int [][] b){
        int [][] x = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int h = 0; h < a[0].length; h++)
                    x[i][j] += a[i][h] * b[h][j];
            }
        }
        return x;
    }

    //nhập từng phần tử vào ma trận
    public static int [][] nhap(int m,int n){
        int[][] result = new int [m][n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử tại vị trí [ "+ i +" ] [ "+ j +" ] : ");
                result[i][j] = sc.nextInt();
            }
        }
        return result;
    }

    //hàm xuất ma trận
    public static void xuat(int[][] a) {
        for(int [] x : a) {
            for(int y : x)
                System.out.print(y + " ");
            System.out.println(" ");
        }
    }

    //hàm main
    public static void main(String[] args) {
        inIt();
    }
}
