package modeles;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Artiste {
    @Id
    int id;
    @Column
    String nom;
    @Column
    String prenom;
    @Column(name = "annee_naissance")
    String annee;
    @Column

    @OneToMany
    @JoinColumn(name = "id_realisateur")
    private Set<Film> filmsRealises = new HashSet<Film>();

    public void addFilmsRealise(Film f) {
        filmsRealises.add(f);
    }

    public Set<Film> getFilmsRealises() {
        return filmsRealises;
    }
    @OneToMany(mappedBy = "pk.acteur")
    private Set<Role> roles = new HashSet<Role>();
    public Set<Role> getRoles() {
    return this.roles;
    }
    public void setRoles(Set<Role> r) {
    this.roles = r;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    @ManyToMany(mappedBy = "acteurs")
    Set<Film> filmo;
    public Set<Film> getFilmo() {
    return filmo;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

}
