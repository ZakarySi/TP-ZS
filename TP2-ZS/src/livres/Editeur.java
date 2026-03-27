package livres;

/**
 * CoursPOO 1
 *
 * @author THOMAS ULIMWENE
 * @since H26
 */

import java.util.List;

public class Editeur {
    private String nom;
    private List<String> languesPublication;

    public Editeur(String nom, List<String> languesPublication){
        this.nom= nom;
        this.languesPublication= languesPublication;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getLanguesPublication() {
        return languesPublication;
    }

    public void setLanguesPublication(List<String> languesPublication) {
        this.languesPublication = languesPublication;
    }

}
