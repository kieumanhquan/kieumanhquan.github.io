package Basic;

import static java.lang.Math.sqrt;

public class Ex7 {
    public static void main(String[] args) {
        for(int i = 100000; i <= 999999; i += 2){
            if(isPrimeNumber(i) && checkNumber(i)){
                System.out.println(i);
            }
        }
    }

    //kiểm tra các số là số lẻ
    private static boolean checkNumber(int n) {
        int temp;
        while(n > 0){
            temp = n % 10;
            if(temp % 2 == 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    //kiểm tra là số nguyên tố
    public static boolean isPrimeNumber(int n) {
        int delta = (int) sqrt(n);
        for (int i = 2; i <= delta; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
