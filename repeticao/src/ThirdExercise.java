import java.util.Scanner;

public class ThirdExercise {

    static void findSum(int start, int end){
        int sum = 0;

        for (int i = start; i <= end; i++) {
           sum += i;
        };

        System.out.println(sum);
    }
    public static void main() {
        Scanner x = new Scanner(System.in);


        int start = x.nextInt();
        int end = x.nextInt();


        findSum(start, end);
    }
}
