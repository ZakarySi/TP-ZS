package livres;

import java.util.Objects;

public class Pays {

    public static final String PAYS_INCONNU = "UKN";

    private String nom;
    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public Pays(String pnom,String pcode) {
        setNom(pnom);
        setCode(pcode);

        assert (!pcode.matches("[A-Z][A-Z][A-Z]")) :
                "Le code du pays doit comporter exactement 3 lettres MAJUSCULES!!!";

        if (!pcode.matches("[A-Z][A-Z][A-Z]")) {
            setCode(PAYS_INCONNU);
            System.out.println("Le code de pays a été changé a \"unknown\"... ");
        }
    }

    @Override
    public String toString() {
        return "Pays {" + nom + ", " + code + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pays pays)) return false;

        return nom.equals(pays.nom) && code.equals(pays.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, code);
    }
}
