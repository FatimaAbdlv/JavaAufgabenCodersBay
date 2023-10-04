public class Aufgabe12 {
    public static void main(String[] args) {

        for (int row1 = 1; row1 <= 10; row1++) {
            for (int row = 1; row <= 10; row++) {
                int solution = row1*row;
                if (solution<=100)
                    System.out.println(row1+" * "+row+"= "+row1*row);

            }
        }
    }
}

