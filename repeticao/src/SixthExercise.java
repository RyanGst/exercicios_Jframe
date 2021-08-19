import java.util.Scanner;

/**
 * SixthExercise
 */
public class SixthExercise {
    public static void main() {

        int fat;

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(n + "! =");

        for (fat = 1; n > 1; n = n - 1) {
            fat = fat * n;
        }

        System.out.println(fat);
    }

}