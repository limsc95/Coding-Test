package baekjoon.BJ1676_팩토리0개수;

import java.util.Scanner;

public class BJ1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = (n/5) + (n/25) + (n/125);

        System.out.println(answer);
    }
}
