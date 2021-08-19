public class SecondExercise {

    static void findEven(int start, int end){
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main() {
        findEven(1, 38);
    }
}
