package livres;

import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage {
    public static final Format TYPE_DEFAULT = Format.analogique;
    private Format typeAudio = TYPE_DEFAULT;
    private int dureeMinutes;

    public enum Format {
        numerique , analogique
    }

    public Format getTypeAudio() {
        return typeAudio;
    }

    public void setTypeAudio(Format typeAudio) {
        this.typeAudio = typeAudio;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public OuvrageAudio (String titre, Auteur auteur, Ouvrage.Format type,
                         LocalDate date, int nombreExemplaires , int minutes, Format format) {
        super(titre, auteur, type, date, nombreExemplaires);
        setDureeMinutes(minutes);
        setTypeAudio(format);
    }
}
