package livres;

import java.util.List;

public class Editeur {
    private String nom;
    private List<String> languesPublication;

    public Editeur(String nom, List<String> languesPublications) {
        this.nom = nom;
        this.languesPublication= languesPublications;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getLanguesPublications() {
        return languesPublication;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getLanguesPublication() {
        return languesPublication;
    }

}

