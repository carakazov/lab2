package Servlets;

import beans.ActorBean;
import dao.ActorDAO;
import dao.IDAO;
import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowAndCreateServlet extends HttpServlet {
    private final ActorDAO actorDao = new ActorDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Actor> actors = actorDao.getAll();
        Actor test = new ActorDAO().getOne(3);
        ActorBean bean = new ActorBean();
        bean.setName(test.getName());
        bean.setSurname(test.getSurname());
        ArrayList<ActorBean> actorBeans = getBeans(actors);
        req.setAttribute("actorBeans", actorBeans);
        req.getRequestDispatcher("ActorList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        Actor actor = new Actor(name, surname);
        actorDao.add(actor);
        List<ActorBean> beans = getBeans(actorDao.getAll());
        req.setAttribute("actorBeans", beans);
        req.getRequestDispatcher("ActorList.jsp").forward(req, resp);
    }

    private ArrayList<ActorBean> getBeans(List<Actor> actors){
        ArrayList<ActorBean> actorBeans = new ArrayList<>();
        for(Actor actor : actors){
            actorBeans.add(new ActorBean(actor));
        }
        return actorBeans;
    }
}
