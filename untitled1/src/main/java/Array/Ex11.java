package Array;

import java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {
        int index = 0;
        int min = 0;
        int tmp = 0;
        int m = 0;
        for (int i = m - 1; i >= 0; i--) {
            tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += A[i,j];
               }
        if (i == m - 1) {
                    min = tmp;
                } else if (tmp < min) {
                    index = i;
                    min = tmp;
                }
                tmp = 0;
            }
            int[ m-1][n] res;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < index) {
                        res[i,j] = A[i,j
                      ];
        }else{
            res[i,j]= A[i + 1,j];
        }
        }
        }
        }

        }



