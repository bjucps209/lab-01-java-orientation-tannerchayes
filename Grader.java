import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int grade = scan.nextInt();

            if (grade >= 38) {
                int remainder = grade % 5;
                if (remainder >= 3) {
                    grade += (5 - remainder);
                }
            }

            System.out.println(grade);
        }
    }
}
