package Basic;

import java.util.Scanner;

public class Ex1_b {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (float) 1 / i;
        }
        System.out.println(sum);
    }
}
