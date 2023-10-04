import java.util.Arrays;
import java.util.Random;

public class Aufgabe14 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        int[] randomNumbers;
        randomNumbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; ++i) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(randomNumbers)); //ACHTE darauf, wo System.out.println steht! Es darf nicht in der Schleife stehen!


        boolean[] trueOrFalse;
        trueOrFalse = new boolean[10];

        Arrays.fill(trueOrFalse, Boolean.FALSE);
        Arrays.fill(trueOrFalse, Boolean.TRUE);

        for (int i = 0; i < trueOrFalse.length; ++i) {
            if (i % 2 == 0) {
                System.out.println(true);
            } else
                System.out.println(false);

        }

    }
}









