import java.util.Scanner;
public class Main {
    public static Scanner key = new Scanner(System.in);
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
        guess();
        String guess = key.nextLine();
        for (int i=0; i< separate.length; i++) {
            if (guess.equalsIgnoreCase(separate[i])) {
                System.out.println(guess+" is in position "+i);
            }
        }

    }
    public static void guess(){

    }
}