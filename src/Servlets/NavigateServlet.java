package Servlets;

import beans.ActorBean;
import dao.ActorDAO;
import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NavigateServlet extends HttpServlet {
    private final ActorDAO actorDAO = new ActorDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("actorId"));
        Actor actor = actorDAO.getOne(id);
        ActorBean actorBean = new ActorBean(actor);
        req.setAttribute("actor", actorBean);
        req.getRequestDispatcher("ModifyForm.jsp").forward(req, resp);
    }
}
