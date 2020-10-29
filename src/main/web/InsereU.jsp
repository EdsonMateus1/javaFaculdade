<%-- 
    Document   : InsereU
    Created on : 28/09/2020, 10:13:05
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.modeloUsuarios" %>
<%@page import="dao.daoUsuarios" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <%
           try {
           modeloUsuarios usuarios = new modeloUsuarios();
           daoUsuarios daoUsu = new daoUsuarios();
           if ( request.getParameter("nome").equals("")) 
           {
         response.sendRedirect("usuarios.jsp");
           }
           else
           {
               String nome = request.getParameter("nome");
               String email = request.getParameter("email");
              
               usuarios.setNome(nome);
               usuarios.setEmail(email);
              
               daoUsu.Inserir(usuarios);
            //response.sendRedirect("listaUsuario.jsp");
          }
                    
               } catch (Exception e) {
                   throw new RuntimeException(e);
                }
    
        %>
    </body>
</html>
