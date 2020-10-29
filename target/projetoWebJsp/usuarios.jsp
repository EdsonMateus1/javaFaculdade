<%-- 
    Document   : usuarios
    Created on : 21/10/2020, 14:32:34
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="style.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div id="all">
         <ul class="menu">
         <img id="logo" src="imagens/logo13.png">
        <li><a href="Principal.jsp">Home</a></li>
        <li><a href="#">Moradores</a></li>
        <li><a href="#">Apartamentos </a></li>
        <li><a href="#">Blocos </a></li>
        <li><a href="#">Carros </a></li>
        <li><a href="#">Areas </a></li>
         <li><a href="usuarios.jsp">Usuarios</a></li>
        <li><a href="#">Contato</a></li>
    </ul>
        </div>
                
<form method="post" action="InsereU.jsp" >
<fieldset>
<legend>Cadastro Usuarios</legend>
<label>Nome:</label>
<input type="text" name="nome"  class="ipn"/>
<br>
<label>E-mail:</label>
<input type="text" name="email"  class="ipe"/>

<input type="submit" name="cadastrar" value="Cadastrar Dados" class="ips"/>
</fieldset>
     <a href="listaUsuario.jsp">Lista de Usuarios</a>    
</form>
       
        
        
    </body>
</html>
