package modeles;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pays")
public class Pays implements Serializable{

    @Id
    String code;

    public void setCode(String c) {
        code = c;
    }

    public String getCode() {
        return code;
    }

    @Column
    String nom;

    public void setNom(String n) {
        nom = n;
    }

    public String getNom() {
        return nom;
    }

    @Column
    String langue;

    public void setLangue(String l) {
        langue = l;
    }

    public String getLangue() {
        return langue;
    }
}