import java.util.Scanner;

public class FouthExercise {

    static void findSum() {

        Scanner x = new Scanner(System.in);


        int sum = 0;

        for (int i = 1; i <= 15; i++) {
            int code = x.nextInt();
            int price = x.nextInt();

            sum += price;
        }
        

        System.out.println(sum);
        System.out.println(sum/15);

    };

    public static void main() {

        findSum();
    }
}
