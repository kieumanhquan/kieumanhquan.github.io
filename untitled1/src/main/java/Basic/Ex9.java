package Basic;

public class Ex9 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (isReversible(i) && checkSum(i) % 10 == 0 && checkNumber(i)) {
                System.out.println(i);
            }
        }
    }

    //kiểm tra số thuận nghịch
    private static boolean isReversible(int n) {
        int revert = 0;
        int m = n;
        while(m > 0){
            revert = revert * 10 + m % 10;
            m /= 10;
        }
        return revert == n;
    }

    //kiểm tra tổng của các chữ số chia hết cho 10
    private static int checkSum(int n) {
        int temp;
        int sum = 0;
        while (n > 0){
            temp = n % 10;
            sum += temp;
            n /= 10;
        }
        return sum;
    }

    //kiểm tra các số có chứa 3 số 0, 6, 8
    private static boolean checkNumber(int n) {
        int temp;
        while (n>0){
            temp = n%10;
            if (temp !=0 && temp!=6 && temp!=8){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
