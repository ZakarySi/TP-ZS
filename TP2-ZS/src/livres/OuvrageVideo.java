package livres;


public class OuvrageVideo extends Ouvrage {
    private int dureeMinutes;
    private double taileMb;

    public OuvrageVideo(String titre, Auteur auteur, double tailleMd, int dureeMinutes) {
        super(titre, auteur);
        this.dureeMinutes = dureeMinutes;
        this.taileMb=tailleMd;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public double getTaileMb() {
        return taileMb;
    }

    public void setTaileMb(double taileMb) {
        this.taileMb = taileMb;
    }

    @Override
    public String toString() {

        return super.toString() +
                "dureeMinutes=" + dureeMinutes +
                ", taileMb=" + taileMb +
                '}';
    }
}
