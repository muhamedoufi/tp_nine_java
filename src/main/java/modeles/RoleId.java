package modeles;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class RoleId implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
@ManyToOne
@JoinColumn(name = "id_acteur")
private Artiste acteur;
public Artiste getActeur() {
return acteur;
}
public void setActeur(Artiste a) {
this.acteur = a;
}
@ManyToOne
@JoinColumn(name = "id_film")
private Film film;
public Film getFilm() {
return film;
}
public void setFilm(Film f) {
this.film = f;
}
}
