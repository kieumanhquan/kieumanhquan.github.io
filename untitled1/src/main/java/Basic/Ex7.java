package Basic;

import static java.lang.Math.sqrt;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố có 6 chữ số chỉ bao gồm các chữ số lẻ: ");
        for(int i = 100001; i <= 999999; i += 2){
            if(isPrimeNumber(i)){
                System.out.println(+ i);
            }
        }
    }

    //kiểm tra các số là số lẻ
    // nếu bước nhảy ở trên bằng 1 thì dùng hàm này
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
