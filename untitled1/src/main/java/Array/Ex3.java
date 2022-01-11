package Array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] b = new int[n];
        int[] a = new int[n];
        inputArray(a,b,n);
        totalNumber(a,b,n);
    }

    //đếm số phần tử xuất hiện có trong mảng
    private static void totalNumber(int[] a,int[] b, int n) {
        int temp = 0;
        int count;
        int max = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            if (b[i]==0){
                b[i]=1;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == a[i]) {
                        count++;
                        b[j]=1;
                    }
                }
                System.out.println(a[i] + " " + count);
                if (max < count){
                    max = count;
                }
                if (max == count){
                    temp = a[i];
                }
            }
        }
        System.out.println(temp);
    }

    // nhập phần từ từ bàn phím
    private static void inputArray(int[] a,int[] b, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + i + " : ");
            a[i] = new Scanner(System.in).nextInt();
            b[i]=0;
        }
    }
}