package baekjoon;

import java.util.Scanner;

public class BJ2083 {
    public static void main(String[] args) {
        // bj 2083
        Scanner scanner = new Scanner(System.in);

        String str;

        String name;
        String age;
        String weight;

        String category;

        while(true) {
            str = scanner.nextLine();

            name = str.split(" ")[0];
            age = str.split(" ")[1];
            weight = str.split(" ")[2];

            if (name.equals("#") && age.equals("0") && weight.equals("0")){
                break;
            }

            if (Integer.parseInt(age) > 17 || Integer.parseInt(weight) >= 80){
                category = "Senior";
            }else {
                category = "Junior";
            }

            System.out.println(name + " " + category);
        }
    }
}
