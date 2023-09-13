public class Superhelte {
    private String navn;
    private String superhelteNavn;
    private boolean erMenneske;
    private double oprindelseAar;
    private double styrke;
    public Superhelte(String navn, String superhelteNavn, boolean erMenneske, double oprindelseAar, double styrke) {
        this.navn = navn;
        this.superhelteNavn = superhelteNavn;
        this.erMenneske = erMenneske;
        this.oprindelseAar = oprindelseAar;
        this.styrke = styrke;
    }

public String getNavn() {
        return navn;
}
public String getSuperhelteNavn(){
        return superhelteNavn;
}
public boolean getErMenneske(){
        return  erMenneske;
}
public double getOprindelseAar(){
        return oprindelseAar;
}
public double getStyrke(){
        return styrke;
}
    @Override
    public String toString() {
        return "Superhelte{" +
                "navn='" + navn + '\'' +
                ", superhelteNavn='" + superhelteNavn + '\'' +
                ", erMenneske=" + erMenneske +
                ", oprindelseAar=" + oprindelseAar +
                ", styrke=" + styrke +
                '}';
    }
}