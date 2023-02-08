package controleurs;

import java.util.List;

import javax.management.relation.Role;
//import jakarta.management.relation.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import modeles.Artiste;
import modeles.Film;
import modeles.Genre;
import modeles.Internaute;
import modeles.Pays;
import modeles.RoleId;

public class TestsHibernate {

    /**
     * Objet Session de Hibernate
     */
    private Session session;

    /**
     * Constructeur établissant une connexion avec Hibernate
     */
    public TestsHibernate() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(modeles.Pays.class);
        configuration.addAnnotatedClass(modeles.Film.class);
        configuration.addAnnotatedClass(modeles.Artiste.class);
        configuration.addAnnotatedClass(modeles.Internaute.class);
        configuration.addAnnotatedClass(modeles.Genre.class);
        configuration.addAnnotatedClass(modeles.Role.class);

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
    }

    public void insertPays(Pays pays) {
        session.beginTransaction();
        session.persist(pays);
        session.getTransaction().commit();
    }

    public List<Pays> lecturePays() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Pays> criteria = builder.createQuery(Pays.class);
        Root<Pays> rootp = criteria.from(Pays.class);
        criteria.select(rootp);
        List<Pays> pays = session.createQuery(criteria).getResultList();
        return pays;
    }
    public List<Film> lectureFilm() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Film> criteria = builder.createQuery(Film.class);
        Root<Film> rootp = criteria.from(Film.class);
        criteria.select(rootp);
        List<Film> films = session.createQuery(criteria).getResultList();
        return films;
    }
    public List<Internaute> lecturInternauList() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Internaute> criteria = builder.createQuery(Internaute.class);
        Root<Internaute> rootp = criteria.from(Internaute.class);
        criteria.select(rootp);
        List<Internaute> internautes = session.createQuery(criteria).getResultList();
        return internautes;
    }
    public List<Artiste> lecturArtist() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Artiste> criteria = builder.createQuery(Artiste.class);
        Root<Artiste> rootp = criteria.from(Artiste.class);
        criteria.select(rootp);
        List<Artiste> artistes= session.createQuery(criteria).getResultList();
        return artistes;
    }
    public List<modeles.Role> lecturRole() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<modeles.Role> criteria = builder.createQuery(modeles.Role.class);
        Root<modeles.Role> rootp = criteria.from(modeles.Role.class);
        criteria.select(rootp);
        List<modeles.Role> roles = session.createQuery(criteria).getResultList();
        return roles;
    }
    public void insertFilm() {
        session.beginTransaction();
        Film gravity = new Film();
        gravity.setTitre("Gravity");
        gravity.setAnnee(2013);
        Genre genre = new Genre();
        genre.setCode("Science-fiction");
        gravity.setGenre(genre);
        Artiste cuaron = new Artiste();
        cuaron.setPrenom("Alfonso");
        cuaron.setNom("Cuaron");
        // Alfonso Cuaron a réalisé Gravity
        cuaron.addFilmsRealise(gravity);
        // Sauvegardons dans la base
        session.save(gravity);
        session.save(cuaron);
        session.getTransaction().commit();
        }

}
