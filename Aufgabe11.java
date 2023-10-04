import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean licence;
        int bier = 0;
        int shots = 0;

        System.out.println("Wie alt bist du?");
        int age = input.nextInt();
        input.nextLine(); //wenn ein boolean Wert eigegeben wird aber in der nächsten Einlesung ein Int (allg wenn unterschiedliche Datentypen
        //erwartet werden, dann input.nextLine(); nach der Einlesung

        System.out.println("Hast du deinen Führerschein dabei?");
        licence = input.nextBoolean();
        input.nextLine();

        System.out.println("Wie viel Bier hast getrunken?");
        bier = input.nextInt();
        System.out.println("Wie viel Shots hast getrunken?");
        shots = input.nextInt();

        if (age >= 17 && licence && (bier + shots) == 0) {
            System.out.println("Du darfst Auto fahren");
        } else if (age >= 19 && licence && (bier + shots) <= 2) { //Unbedingt darauf achten, wo else positioniert wird!! Also nach welcher Klammer.
            System.out.println("Du darfst Auto fahren");

        } else { //Nach jedem if, else if und else eine geschw. Klammer setzen
            System.out.println("Du darfst nicht Auto fahren");
        }

    }
}
// Java has the following conditional statements:
// if: Use if to specify a block of code to be executed, if a specified condition is true
// else: Use else to specify a block of code to be executed, if the same condition is false
// else if: Use else if to specify a new condition to test, if the first condition is false
// switch: Use switch to specify many alternative blocks of code to be executed



