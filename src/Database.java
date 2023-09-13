import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelte> superhelte = new ArrayList<>();
    private Object controller;

    public void nySuperhelt(String navn, String superhelteNavn, boolean erMenneske, double oprindelseAar, double styrke) {
        superhelte.add(new Superhelte(navn, superhelteNavn, erMenneske, oprindelseAar, styrke));
    }

    public ArrayList<Superhelte> hentSuperhelt() {
        return superhelte;
    }

    public Superhelte findSuperhelt(String navn, String superhelteNavn){
        for (Superhelte superhelt : superhelte) {
            if (superhelt.getNavn().contains(navn) || (superhelt.getSuperhelteNavn().contains(superhelteNavn))) {
                return superhelt;
            }
        }
        return null;
    }

    public void søgSuperhelte(String navn) {
    }
}