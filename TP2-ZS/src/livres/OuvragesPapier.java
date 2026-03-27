package livres;

import java.time.LocalDate;

public class OuvragesPapier extends  Ouvrage{

    private int nombreDePage;

    public int getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(int nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    public OuvragesPapier(String titre, Auteur auteur, Format type, LocalDate date, int nombreExemplaires, int nombreDePage) {
        super(titre, auteur, type, date, nombreExemplaires);
        this.nombreDePage = nombreDePage;
    }

    public OuvragesPapier(String titre, Auteur auteur, Format type,int nombreDePage) {
        super(titre, auteur, type);
        this.nombreDePage = nombreDePage;
    }

    public OuvragesPapier(String titre, Auteur auteur, int nombreDePage) {
        super(titre, auteur);
        this.nombreDePage = nombreDePage;
    }


    @Override
    public String toString() {
        String str = "OuvragesPapier contient " +
                + nombreDePage + " nombreDePage";
        return super.toString() + str;
    }
}
