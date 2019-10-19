package mx.hackathonmorelos.Iximati.Inicio.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@MultipartConfig
@WebServlet(name = "InicioController", urlPatterns = "/InicioController")
public class InicioController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion= request.getParameter("accion") == null ? "" : request.getParameter("accion");
        PrintWriter out = response.getWriter();
        switch (accion) {
            case "informacion":{
                System.out.println("Entre a Informacion");
                response.sendRedirect("InformacionController");

                break;
            }
            case "informacionCuautla":{
                System.out.println("Entre a Informacion");
                response.sendRedirect("GestorController");

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
        request.getRequestDispatcher("WEB-INF/Inicio/inicio.jsp").forward(request, response);
    }
}
