package livres;

import java.util.List;

public class Editeur {
    private String nom;
    private List<String> languesPublications;

    public Editeur(String nom, List<String> languesPublications) {
        this.nom = nom;
        this.languesPublications = languesPublications;

    }

    public String getNom() {
        return nom;
    }

    public List<String> getLanguesPublications() {
        return languesPublications;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLanguesPublications(List<String> languesPublications) {
        this.languesPublications = languesPublications;
    }

    @Override
    public String toString() {
        return  "Editeur{" +
                "nom='" + nom + '\'' +
                ", languesPublications=" + languesPublications +
                '}';
    }
}
