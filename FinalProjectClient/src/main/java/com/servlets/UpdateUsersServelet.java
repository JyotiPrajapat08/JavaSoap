/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.helpers.HelperClass;
import com.helpers.HelperClassGoods;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import my.interfaces.Users;
import my.services.BakeImplService;
import my.services.IBake;


/**
 *
 * @author jo
 */
@WebServlet(name = "UpdateUsersServelet", urlPatterns = {"/UpdateUsersServelet"})
public class UpdateUsersServelet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       BakeImplService service = new BakeImplService();
        IBake port = service.getBakeImplPort() ;
        
        
        
        
//        int result = port.updatedBakedGoods(request.getParameter("name"), Double.parseDouble(request.getParameter("price")), Integer.parseInt(request.getParameter("id")));
//
//        List<BakedGoods> goods = port.getAllBakedGoods();
//
//        try (PrintWriter out = response.getWriter()) {
//            out.println(HelperClassGoods.getHTML(goods, "Updated List after Adding Movies!!!"));
//        }
//    }
        
        int result = port.updatedUser(request.getParameter("name"), request.getParameter("password"), Integer.parseInt(request.getParameter("id")));

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Users bg = new Users();
        bg.setUserid(id);
        bg.setUsername(name);
        bg.setPassword(password);
           List<Users> goods = port.getAllUsers();

        try (PrintWriter out = response.getWriter()) {
            out.println(HelperClass.getHTML(goods, "List of all the Users"));
        }
    }
//        int status = port.updatedBakedGoods(name, price, id);
//        if (status > 0) {
//            response.sendRedirect("list");
//        } else {
//            out.println("Sorry! unable to update record");
//        }
//
//        out.close();
//    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
