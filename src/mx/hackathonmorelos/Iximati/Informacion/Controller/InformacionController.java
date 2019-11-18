package mx.hackathonmorelos.Iximati.Informacion.Controller;

import mx.hackathonmorelos.Iximati.Informacion.dao.InformacionDao;
import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "InformacionController", urlPatterns = "/InformacionController")
public class InformacionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InformacionDao usuarioDao = new InformacionDao();
        List<Informacion> usuarios = usuarioDao.obtenerReportes();

        request.getRequestDispatcher("WEB-INF/Informacion/InfoGestor.jsp").forward(request, response);

    }
}
