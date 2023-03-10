package modeles;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {
    String adresse;
public void setAdresse(String v) {adresse = v;}
public String getAdresse() {return adresse;}

    @Column(name = "code_postal")
    String codePostal;

    public void setCodePostal(String v) {
        codePostal = v;
    }

    public String getCodePostal() {
        return codePostal;
    }

    String ville;

    public void setVille(String v) {
        ville = v;
    }

    public String getVille() {
        return ville;
    }

}
