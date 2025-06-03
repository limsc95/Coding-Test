import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long answer = 0;

        for (long i = 1; i < N; i++){
            answer += i * (N + 1);
            System.out.println(i * (N + 1));
        }

        System.out.println(answer);
    }
}
