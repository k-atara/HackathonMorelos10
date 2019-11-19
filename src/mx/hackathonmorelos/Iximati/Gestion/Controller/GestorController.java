package mx.hackathonmorelos.Iximati.Gestion.Controller;

import mx.hackathonmorelos.Iximati.Informacion.dao.InformacionDao;
import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GestorController", urlPatterns = "/GestorController")
public class GestorController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InformacionDao informacionDao = new InformacionDao();
        List<Informacion> reportesMunicipio = informacionDao.obtenerReportesMunicipio(33);
        request.setAttribute("reportesMunicipio", reportesMunicipio);

        request.getRequestDispatcher("WEB-INF/Gestor/Gestor.jsp").forward(request, response);
    }
}
