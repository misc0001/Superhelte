import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelte> superhelte = new ArrayList<Superhelte>();

    public void nySuperhelt(String navn, String superhelteNavn, boolean erMenneske, double oprindelseAar, double styrke) {
        superhelte.add(new Superhelte(navn, superhelteNavn, erMenneske, oprindelseAar, styrke));
    }

    public ArrayList<Superhelte> hentSuperhelt() {
        return superhelte;
    }

    public Superhelte findSuperhelt(String navn) {
        for (Superhelte sh : superhelte) {
            if (sh.getNavn().equals(navn)) {
                return sh;
            }
        }
        return null;
    }
}