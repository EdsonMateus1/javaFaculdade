<%-- 
    Document   : InsereM
    Created on : 26/10/2020, 22:04:25
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.modeloMoradores" %>
<%@page import="dao.daoMoradores" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          modeloMoradores moradores = new modeloMoradores();
          daoMoradores daoM = new daoMoradores();
          String nome = request.getParameter("nome");
          String cpf = request.getParameter("cpf");
          String telefone  = request.getParameter("telefone");
          
          moradores.setNome(nome);
          moradores.setCpf(cpf);
          moradores.setTelefone(telefone);
          daoM.Inserir(moradores);
         out.println("MORADOR CADASTRADO COM SUCESSO");
        %>
    </body>
</html>
