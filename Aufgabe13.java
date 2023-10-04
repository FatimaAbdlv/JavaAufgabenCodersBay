import java.util.Scanner;

public class Aufgabe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean vip = true;
        boolean parent = true;

        System.out.println("Geben Sie Ihr Alter ein: ");
        int age = input.nextInt();
        input.nextLine();


        if (age >= 4 && age < 16) {
            System.out.println("Begleitperson? (true/false)");
            parent = input.nextBoolean();
            if (parent)
                System.out.println("Rotes Armband");
            System.out.println("VIP (true/false)?");
            vip = input.nextBoolean();
            if (vip)
                System.out.println("Rotes und goldenes Armband!");

        } else if (age >= 16) {
            System.out.println("Gelbes Armband");
            System.out.println("VIP? (true/false)");
            vip = input.nextBoolean();
            if (vip)
                System.out.println("Gelber und goldenes Armband!");

        } else if (age >= 18) {
            System.out.println("Grünes Armband");
            System.out.println("VIP? (true/false)");
            vip = input.nextBoolean();
            if (vip)
                System.out.println("Grünes und goldenes Armband!");
        } else {
            System.out.println("Kein Zutritt!");

        }
    }


}




