import java.util.Scanner;

public class Main {
    private Controller controller;
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Main menu = new Main();
        Database db = new Database();
        menu.controller = new Controller(db);
        menu.startProgram();
    }
    public void startProgram() {
        int brugerValg = -1;

        while(brugerValg != 9) {
            System.out.println("1. Opret Superhelt " + "2. Vis Superhelte " + "9. Afslut");
            brugerValg = keyboard.nextInt();
            keyboard.nextLine();
            håndterBrugerValg(brugerValg);
        }
    }
    public void håndterBrugerValg(int brugerValg) {
        if (brugerValg == 1)
            nySuperhelt();
        else if (brugerValg == 2)
            visSuperhelte();
    }
    public void nySuperhelt() {
        System.out.println("Din helts civile navn: ");
        String navn = keyboard.next();
        System.out.println("Din helts hemmelige identitet: ");
        String superhelteNavn = keyboard.next();
        System.out.println("Er din helt menneske?: ");
        String menneske = keyboard.next();
        boolean erMenneske;
        if (menneske.equals("ja")) {
            erMenneske = true;
        } else {
            erMenneske = false;
        }
        System.out.println("Hvornår er din helt fra?: ");
        double oprindelseAar = keyboard.nextDouble();
        System.out.println("Hvor stærk er din helt?: ");
        double styrke = keyboard.nextDouble();
        controller.nySuperhelt(navn, superhelteNavn, erMenneske, oprindelseAar, styrke);
    }
    public void visSuperhelte() {
        if (controller.hentSuperhelt().size() == 0)
            System.out.println("ingen helte!");
        else {
            for (Superhelte sh: controller.hentSuperhelt()){
                System.out.println(sh);
            }
        }
    }
}
