package book1;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        int[] stone = {1,2,1,4};

        Dog[] dogs = {
                new Dog("루비","11",3,4),
                new Dog("피치","12",3,3),
                new Dog("씨","13",2,1),
                new Dog("코블","14",1,1)
        };

        solution(stone, dogs);
    }
    public static void solution(int[] stone, Dog[] dogs) {
        StringBuilder answer = new StringBuilder();

        for (Dog dog : dogs) {
            int stoneLine = 0;
            boolean win = true;

            while (stoneLine < stone.length) {
                stoneLine += dog.jump;

                if (stoneLine > stone.length) {
                    break;
                }

                stone[stoneLine - 1] -= dog.weight;

                if (stone[stoneLine - 1] <= 0) {
                    win = false;
                    break;
                }

            }
            if (win) {
                answer.append(dog.name).append(", ");
            }
            System.out.println(Arrays.toString(stone));
        }
        System.out.println(answer);
    }
}

class Dog{
    String name;
    String  age;
    int jump;
    int weight;

    public Dog(String name, String age, int jump, int weight) {
        this.name = name;
        this.age = age;
        this.jump = jump;
        this.weight = weight;
    }
}