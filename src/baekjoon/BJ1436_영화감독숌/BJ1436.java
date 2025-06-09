package baekjoon.BJ1436_영화감독숌;

import java.util.Scanner;

public class BJ1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 665;

        for (int i = 0; i < n; i++) {
            while (true){
                answer++;
                String str = String.valueOf(answer);
                if (str.contains("666")){
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
