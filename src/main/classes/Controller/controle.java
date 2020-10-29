/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.modeloUsuarios;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "controle", urlPatterns = {"/controle"})
public class controle extends HttpServlet {

    dao.daoUsuarios udao = new dao.daoUsuarios();
   modeloUsuarios us = new modeloUsuarios();
    int resposta;

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        us.setNome(nome);
        us.setEmail(email);
        resposta = udao.validar(us);
        if (resposta == 1) {
            response.sendRedirect("Principal.jsp");

        } else {
            response.sendRedirect("login.jsp");

        }
    }
}
