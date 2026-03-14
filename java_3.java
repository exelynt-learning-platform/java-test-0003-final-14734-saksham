import java.util.Scanner;

public class java_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int value;
            if (i % 2 == 1)
                value = 1;
            else
                value = 0;

            for (int j = 1; j <= i; j++) {

                System.out.print(value + " ");
                value = (value == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}
