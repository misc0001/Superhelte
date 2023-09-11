import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Din helts civile navn: ");
        String navn = keyboard.nextLine();
        System.out.println("Din helts hemmelige identitet: ");
        String superhelteNavn = keyboard.nextLine();
        System.out.println("Er din helt menneske?: ");
        boolean menneske = keyboard.nextBoolean();
        System.out.println("Hvornår er din helt fra?: ");
        double regAar = keyboard.nextDouble();
        System.out.println("Hvor stærk er din helt?: ");
        double styrke = keyboard.nextDouble();


        Superhelte superhelte = new Superhelte(navn, superhelteNavn, menneske, regAar, styrke);
        Database superHelte = new Database();
        superHelte.nySuperhelt(superhelte);
        System.out.println(superhelte);
    }
}
