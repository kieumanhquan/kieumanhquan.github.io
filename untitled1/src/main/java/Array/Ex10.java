package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public void mang(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = scanner.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Nhập các phần tử trong mảng: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++){
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + A[i][i];
        }
        System.out.println("Tổng đường chéo chính: " + sum);

        sum = 0;
        for(int i = n - 1; i >= 0; i--){
            sum = sum + A[i][i];
        }
        System.out.println("Tổng đường chéo phụ: " + sum);
    }
    public static void main(String []argv){
        Ex10 ex10 = new Ex10();
        ex10.mang();
    }
}
