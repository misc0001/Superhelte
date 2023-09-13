    import java.util.ArrayList;

    public class Controller {
        public Database database;

        public Controller(Database database) {
            this.database = database;
        }
        public void nySuperhelt(String navn, String superhelteNavn, boolean erMenneske, double oprindelseAar, double styrke) {
            database.nySuperhelt(navn, superhelteNavn, erMenneske, oprindelseAar, styrke);
        }
        public void søgSuperhelte(String navn) {
            database.søgSuperhelte(navn);
        }
        public ArrayList<Superhelte>hentSuperhelt(){
            return database.hentSuperhelt();
        }

    }