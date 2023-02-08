package controleurs;

import java.io.IOException;
import java.util.List;

import javax.management.relation.Role;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modeles.Artiste;
import modeles.Film;
import modeles.Internaute;
import modeles.Pays;

public class Hibernate extends HttpServlet {
    private String VUES = "/WEB-INF/vues/jdbc/";

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        // La vue par défaut
        String maVue = VUES + "index.jsp";
        
        
        try {

           if(action==null){

           }
           else if(action.equals("connexion")){
             new TestsHibernate();
            
            maVue = VUES + "connexion.jsp";
           }
           else if(action.equals("internaute")){
            TestsHibernate tstHiber = new TestsHibernate();
            List<Internaute> internautes = tstHiber.lecturInternauList();
            request.setAttribute("internautes", internautes);
            maVue = VUES + "internaute.jsp";
           }
           else if(action.equals("artiste")){
            TestsHibernate tstHiber = new TestsHibernate();
           // tstHiber.insertFilm();
            List<Artiste> films = tstHiber.lecturArtist();
            request.setAttribute("films", films);
            maVue = VUES + "artistes.jsp";
           }
           else if(action.equals("selectAllpys1")){
            TestsHibernate tstHiber = new TestsHibernate();
            List<Pays> pays = tstHiber.lecturePays();
            request.setAttribute("pays", pays);
            maVue = VUES + "roles.jsp";
           }
           else if(action.equals("roles")){
            TestsHibernate tstHiber = new TestsHibernate();
            List<modeles.Role> roles = tstHiber.lecturRole();
            request.setAttribute("roles", roles);
            maVue = VUES + "roles.jsp";
           }
           else if(action.equals("selectAllfilm")){
           TestsHibernate tstHiber = new TestsHibernate();
           List<Artiste> films= tstHiber.lecturArtist();
            request.setAttribute("films",films);
            maVue = VUES + "allfilms.jsp";
           }
           
           else if(action.equals("selectAllfilmartiste")){
            TestsHibernate tstHiber = new TestsHibernate();
            List<Film> films= tstHiber.lectureFilm();
             request.setAttribute("films",films);
             maVue = VUES + "filmrealisateur.jsp";
            }
           else 
           {
                TestsHibernate tstHiber = new TestsHibernate();
                Pays monPays = new Pays();
                monPays.setCode(request.getParameter("code"));
                monPays.setNom(request.getParameter("nom"));
                monPays.setLangue(request.getParameter("lng"));
                tstHiber.insertPays(monPays); 
                request.setAttribute("pays",monPays);
                maVue = VUES + "insertion.jsp";
            }

        } catch (Exception e) {
            maVue = VUES + "exception.jsp";
            System.out.println(11458);
            request.setAttribute("message", e.getMessage());
        }
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher(maVue);
        dispatcher.forward(request, response);
    }
}
