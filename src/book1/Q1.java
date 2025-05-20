package book1;

public class Q1 {
    public static void main(String[] args) {
        String[] q1 = {
                "   + -- + - + -   ",
                "   + --- + - +   ",
                "   + -- + - + -   ",
                "   + - + - + - +   "
        };

        soloution(q1);
    }

    private static void soloution(String[] q1) {

        String x = "";
        String y = "";

        for (int i = 0; i< q1.length; i++){
            int n = Integer.parseInt(q1[i].strip()
                    .replace(" ", "")
                    .replace("+","1")
                    .replace("-","0"),2);
            q1[i] = String.valueOf((char) n);

            x += n + " ";
            y += q1[i];
        }

        System.out.println(x);
        System.out.println(y);
    }
}
