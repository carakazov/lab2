package Servlets;

import dao.ActorDAO;
import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String surname = req.getParameter("userSurname");
        req.setAttribute("userName", "test");
        req.setAttribute("userSurname", "test");
        ActorDAO actorDAO = new ActorDAO();
        Actor actor = new Actor("from lab2", "from lab2");
        actorDAO.add(actor);
        req.getRequestDispatcher("/myPage.jsp").forward(req, resp);
    }
}
