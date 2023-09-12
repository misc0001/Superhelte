import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }
    public void nySuperhelt(String navn, String superhelteNavn, boolean erMenneske, double oprindelseAar, double styrke) {
        db.nySuperhelt(navn, superhelteNavn, erMenneske, oprindelseAar, styrke);
    }
    public ArrayList<Superhelte>hentSuperhelt(){
        return db.hentSuperhelt();
    }
}
