import java.util.Scanner;

public class aufgabe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel Bier hast getrunken?");
        int bier = input.nextInt();
        System.out.println("Wie viel Shots hast du getrunken?");
        int shots = input.nextInt();

        if (bier + shots == 0) {
            System.out.println("Gar nicht betrunken");

        } else if (bier + shots <= 2) {
            System.out.println("leicht betrunken");
        }

        if (bier > 2 && bier <= 6 && shots == 0) {
                System.out.println("Betrunken");
        } else
            System.out.println("Hoffnungsloser Fall");

    }

}


