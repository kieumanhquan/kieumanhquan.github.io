package Basic;

import java.util.Scanner;

public class Ex4 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Nhập a:");
//            int a = sc.nextInt();
//            System.out.println("Nhập b:");
//            int b = sc.nextInt();
//
//            if(a>0 && b>0) {
//                for(int  i = a; i <= b; i++) {
//                    if(isPrimeNumber(i)) {
//                        System.out.println(i);
//                    }
//                }
//            }
//
//        }
//        public static boolean isPrimeNumber(int n) {
//            if (n < 2) {
//                return false;
//            }
//
//            int squareRoot = (int) Math.sqrt(n);
//            for (int i = 2; i <= squareRoot; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        for (int i = a; i <= b; i++){
            for (int j = a + 1; j <= b; j++){
                if(ucln( i, j) == 1){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    private static int ucln(int a, int b) {
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
}

