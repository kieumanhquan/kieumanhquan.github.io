package Basic;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
