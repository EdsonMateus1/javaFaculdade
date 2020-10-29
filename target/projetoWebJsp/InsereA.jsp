<%-- 
    Document   : InsereA
    Created on : 28/10/2020, 21:11:58
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.modeloApartamentos" %>
<%@page import="dao.daoApartamentos" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        modeloApartamentos map = new modeloApartamentos();
        daoApartamentos dap = new daoApartamentos();
        
         String numero = request.getParameter("numero");
         String andar = request.getParameter("andar");
         String bloco =  request.getParameter("bloco");
         String quartos = request.getParameter("quartos");
         map.setNumero(numero);
         map.setAndar(andar);
         map.setBloco(bloco);
         map.setQuartos(quartos);
         dap.Inserir(map);
        out.println("Cadastrdo com sucesso!!");
        
        
        %>
    </body>
</html>
