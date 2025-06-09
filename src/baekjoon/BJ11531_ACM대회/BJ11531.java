package baekjoon.BJ11531_ACM대회;

import java.util.Scanner;

public class BJ11531 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[27];
        int answer = 0;
        int sumTime = 0;

        while (true){
            String str = sc.nextLine();
            if (str.equals("-1")) break;
            int x = Integer.parseInt(str.split(" ")[0]);
            String y = str.split(" ")[1];
            char ch = y.charAt(0);
            String z = str.split(" ")[2];

            if (z.equals("right")){
                answer++;
                sumTime = sumTime + x + arr[ch - 'A'] * 20;
            }
            else if (z.equals("wrong")){
                arr[ch - 'A']++;
            }
        }
        System.out.println(answer + " " + sumTime);
    }
}
