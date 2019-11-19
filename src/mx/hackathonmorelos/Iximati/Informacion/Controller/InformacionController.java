package mx.hackathonmorelos.Iximati.Informacion.Controller;

import mx.hackathonmorelos.Iximati.Informacion.dao.InformacionDao;
import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "InformacionController", urlPatterns = "/InformacionController")
public class InformacionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion= request.getParameter("accion") == null ? "" : request.getParameter("accion");
        PrintWriter out = response.getWriter();
        switch (accion) {
            case "inicio":{
                System.out.println("Entre a Inicio");
                response.sendRedirect("InicioController");
                break;
            }
            case "login":{
                System.out.println("Entre a Login");
                response.sendRedirect("LoginController");

                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InformacionDao informacionDao = new InformacionDao();
        List<Informacion> reportesAutorizacion = informacionDao.obtenerReportesAutorizacion();
        request.setAttribute("reportesAutorizacion", reportesAutorizacion);

        List<Informacion> reportesConvenio = informacionDao.obtenerReportesConvenio();
        request.setAttribute("reportesConvenio", reportesConvenio);

        List<Informacion> reportesLicencia = informacionDao.obtenerReportesLicencia();
        request.setAttribute("reportesLicencia", reportesLicencia);

        List<Informacion> reportesContrato = informacionDao.obtenerReportesContrato();
        request.setAttribute("reportesContrato", reportesContrato);

        List<Informacion> reportesPermiso = informacionDao.obtenerReportesPermiso();
        request.setAttribute("reportesPermiso", reportesPermiso);

        List<Informacion> reportesConcesion = informacionDao.obtenerReportesConcesion();
        request.setAttribute("reportesConcesion", reportesConcesion);

        List<Informacion> reportesAsignaciones = informacionDao.obtenerReportesAsignaciones();
        request.setAttribute("reportesAsignaciones", reportesAsignaciones);

        request.getRequestDispatcher("WEB-INF/Informacion/InfoGestor.jsp").forward(request, response);

    }
}
