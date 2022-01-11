package Array;

import java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {
                int m, n;
                int tong = 0, min;
                int rowPosition = 0;    // vị trí dòng
                Scanner scanner = new Scanner(System.in);

                System.out.print("Nhập vào số dòng của ma trận: ");
                m = scanner.nextInt();
                System.out.print("Nhập vào số cột của ma trận: ");
                n = scanner.nextInt();

                int A[][] = new int[m][n];

                System.out.println("Nhập các phần tử cho ma trận: ");
                for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                System.out.print("A[" + i + "]["+ j + "] = ");
                                A[i][j] = scanner.nextInt();
                        }
                }

                System.out.println("Ma trận A vừa nhập:");
                for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                System.out.print(A[i][j] + "\t");
                        }
                        System.out.println("\n");
                }

                // tìm tổng trên dòng đầu tiên (i = 0) của ma trận
                for (int j = 0; j < n; j++) {
                        tong += A[0][j];
                }

                min = tong;

                for (int i = 1; i < m; i++) {
                        tong = 0;
                        for (int j = 0; j < n; j++) {
                                tong += A[i][j];
                        }

                        // nếu giá trị của tổng các số ở các dòng sau
                        // lớn hơn tổng các số ở dòng đầu tiên
                        // thì gán max = tong
                        if (tong < min) {
                                min = tong;
                                // lưu lại vị trí dòng có tổng lớn nhất
                                rowPosition = i;
                        }
                }

                for (int i = rowPosition; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                // đẩy phần tử ở dòng i + 1 lên
                                // vị trí ở dòng i
                                A[i][j] = A[i+1][j];
                        }
                        m--;    // giảm số dòng của ma trận đi 1
                }

                System.out.println("Ma trận A sau khi xóa dòng có tổng nhỏ nhất:");
                for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                                System.out.print(A[i][j] + "\t");
                        }
                        System.out.println("\n");
                }
        }

}



