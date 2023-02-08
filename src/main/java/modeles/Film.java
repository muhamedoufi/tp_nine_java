package modeles;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film implements Serializable {
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer i) {
        id = i;
    }

    @Column
    String titre;

    public void setTitre(String t) {
        titre = t;
    }

    public String getTitre() {
        return titre;
    }

    
    @Column 
    String resume;
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre2) {
        this.genre = genre2;
    }

    @ManyToOne
    @JoinColumn(name = "genre")
    Genre genre;
    @Column
    Integer annee;

    public void setAnnee(Integer a) {
        annee = a;
    }

    public Integer getAnnee() {
        return annee;
    }

    @ManyToOne
    @JoinColumn(name = "code_pays")
    Pays pays;

    public void setPays(Pays p) {
        pays = p;
    }

    public Pays getPays() {
        return pays;
    }
    @ManyToOne
    @JoinColumn(name = "id_realisateur")
    Artiste realisateur;

    public Artiste getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Artiste realisateur) {
        this.realisateur = realisateur;
    }

    @ManyToMany()
    @JoinTable(name = "Role", joinColumns = @JoinColumn(name = "id_film"),
    inverseJoinColumns = @JoinColumn(name = "id_acteur"))
    Set<Artiste> acteurs = new HashSet<Artiste>();
    public Set<Artiste> getActeurs() {
    return acteurs;
    }
@OneToMany(mappedBy = "pk.film")
private Set<Role> roles = new HashSet<Role>();
public Set<Role> getRoles() {
return this.roles;
}
public void setRoles(Set<Role> r) {
this.roles = r;
}
 
}