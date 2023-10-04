import java.util.Arrays;

public class Aufgabe16 {
    public static void main(String[] args) {
        char[] caLatter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int howMuch = 1;
        char[] result = new char[caLatter.length];


        for (int i = 0; i < (char) caLatter.length; i++) { //ohne (char) wurde in der Ausgabe die Werte aus caLatter als ASCII Werte ausgegeben, deshalb direkt in der FOR Schleife caLatter zu (char) konvertieren bzw. casten
            if (howMuch > 0) {
                result[(i + howMuch) % caLatter.length] = caLatter[i];
            } else if (howMuch < 0) {
                result[(i + (caLatter.length - howMuch)) % caLatter.length] = caLatter[i];
            }
        }

        System.out.println(result);


    }


}
