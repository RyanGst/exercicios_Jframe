
/**
 * FifthExercise
 */
public class FifthExercise {
    public static void main() {
        
        double chico =  1.50;
        double juca =  1.10;
        int tempo = 0;
        
        while(chico >= juca){
            chico += 0.02;
            juca += 0.03;
            tempo++;
        }
        System.out.println("São necessários " + tempo + "anos para juca passar chico");
    }
}