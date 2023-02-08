package modeles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id

    RoleId pk;

    public RoleId getPk() {
        return pk;
    }

    public void setPk(RoleId pk) {
        this.pk = pk;
    }

    @Column(name = "nom_role")
    private String nom;

    public void setNom(String n) {
        nom = n;
    }

    public String getNom() {
        return nom;
    }

    public Film getFilm() {
        return getPk().getFilm();
    }

    public void setFilm(Film film) {
        getPk().setFilm(film);
    }

    public Artiste getActeur() {
        return getPk().getActeur();
    }

    public void setActeur(Artiste acteur) {
        getPk().setActeur(acteur);
    }

}
