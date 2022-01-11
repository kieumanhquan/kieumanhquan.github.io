package Basic;

import static java.lang.Math.sqrt;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (isPrimeNumber(i) && checkNumber(i) && isReversible(i)) {
                System.out.println(i);
            }
        }
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

    //kiểm tra các chữ số trong số đó là số nguyên tố
    private static boolean checkNumber(int n) {
        int temp;
        while(n>0){
            temp = n%10;
            if(!isPrimeNumber(temp)){
                return false;
            }
            n/=10;
        }
        return true;
    }

    //đảo ngc số đó lại thì vẫn là số nguyên
    private static boolean isReversible(int n) {
        int revert = 0;
        int m = n;
        while(m >0){
            revert = revert * 10 + m % 10;
            m /= 10;
        }
        return isPrimeNumber(revert);
    }
}
