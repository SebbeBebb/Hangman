import java.util.Scanner;

public class Main {
    public static Scanner key = new Scanner(System.in);
    public static int lives = 5;

    public static void main(String[] args) {
        String[] ordlista = new String[11];
        ordlista[0] = "Piston";
        ordlista[1] = "Cup";
        ordlista[2] = "Chick";
        ordlista[3] = "Hicks";
        ordlista[4] = "Strip";
        ordlista[5] = "Weathers";
        ordlista[6] = "King";
        ordlista[7] = "Mater";
        ordlista[8] = "Fabulous";
        ordlista[9] = "Hudson";
        ordlista[10] = "Hornet";

        int wordgen = (int) (Math.random() * 11);
        String word = ordlista[wordgen];
        System.out.println(word);

        String[] separate;
        separate = word.split("");
        String guess = key.nextLine();
        while (lives > 0) {
            guess(guess, separate);
        }
    }

    static void guess(String guess, String[] separate) {
        if (lives > 0) {
            for (int i = 0; i < separate.length; i++) {
                if (guess.equalsIgnoreCase(separate[i])) {
                    System.out.println(guess + " is in position " + i);
                    guess(guess, separate);
                } else {
                    System.out.println("Wrong!");
                    lives--;
                }
            }
        }
    }
}