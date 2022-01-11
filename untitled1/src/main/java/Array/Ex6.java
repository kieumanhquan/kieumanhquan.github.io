package Array;

import java.util.Scanner;

public class Ex6 {
    public void Array(){
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("Nhập số lượng phần tử trong mảng:");
        n = sc.nextInt();
        System.out.print("Nhập số X:");
        x = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhập mảng:");

        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhập phần tử thứ " + (i + 1) +" : ");
            a[i] = sc.nextInt();
        }
        int []b = new int [n+1];
        for(int i = 0; i < n; i++)
        {
            b[i] = a[i];
        }
        b[n] = x;

        int tam;
        for(int i = 0; i < n; i++)
        {
            for(int j=i+1; j<n+1; j++){
                if(b[i]>b[j]){
                    tam=b[i];
                    b[i]=b[j];
                    b[j]=tam;
                }
            }
        }
        System.out.print("mang sau chen:");
        for(int i = 0; i <= n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }

    public  static void main(String []argv){
        Ex6 ex6=new Ex6();
        ex6.Array();
    }
}
