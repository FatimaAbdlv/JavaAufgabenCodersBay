public class Aufgabe15 {
    public static void main(String[] args) {

        String sentence = "Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!";
        int myDigit = 0;
        int myUPLatter = 0;
        int myLOLatter = 0;
        int myExtraChar = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                myDigit++;
            } else if (Character.isUpperCase(sentence.charAt(i))) {
                myUPLatter++;

            } else if (Character.isLowerCase(sentence.charAt(i))) {
                myLOLatter++;
            } else if (!Character.isDigit(sentence.charAt(i)) && !Character.isLetter(sentence.charAt(i))) {
                myExtraChar++;
            }

            System.out.println("Content: Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!");
            System.out.println("Großbuchstaben: " + myUPLatter);
            System.out.println("Kleinbuchstaben " + myLOLatter);
            System.out.println("Zahlen: " + myDigit);
            System.out.println("Sonstige Zeichen: " + myExtraChar);

        }


    }
}



