public class Superhelte {
    private String navn;
    private String superhelteNavn;
    private boolean menneske;
    private double regAar;
    private double styrke;
    public Superhelte(String navn, String superhelteNavn, boolean menneske, double regAar, double styrke) {
        this.navn = navn;
        this.superhelteNavn = superhelteNavn;
        this.menneske = menneske;
        this.regAar = regAar;
        this.styrke = styrke;
    }

public String getNavn() {
        return navn;
}
public String getSuperhelteNavn(){
        return superhelteNavn;
}
public boolean getMenneske(){
        return  menneske;
}
public double getRegAar(){
        return regAar;
}
public double getStyrke(){
        return styrke;
}
    @Override
    public String toString() {
        return "Superhelte{" +
                "navn='" + navn + '\'' +
                ", superhelteNavn='" + superhelteNavn + '\'' +
                ", menneske=" + menneske +
                ", regAar=" + regAar +
                ", styrke=" + styrke +
                '}';
    }
}


