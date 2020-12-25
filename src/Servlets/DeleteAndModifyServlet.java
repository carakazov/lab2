package Servlets;

import beans.ActorBean;
import dao.ActorDAO;
import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteAndModifyServlet extends HttpServlet {
    private final ActorDAO actorDao = new ActorDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int actorId = Integer.parseInt(req.getParameter("actorId"));
        actorDao.delete(actorId);
        List<ActorBean> beans = getBeans(actorDao.getAll());
        req.setAttribute("actorBeans", beans);
        req.getRequestDispatcher("ActorList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("actorId"));
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        Actor actor = new Actor(name, surname);
        actor.setId(id);
        actorDao.update(actor);
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
