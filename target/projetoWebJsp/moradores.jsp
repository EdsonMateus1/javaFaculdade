<%-- 
    Document   : moradores
    Created on : 26/10/2020, 22:03:29
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Moradores</title>
    </head>
    <body>
 <form method="post" action="InsereM.jsp" >
<fieldset>
<legend>Cadastro de Moradores</legend>
<label>Nome:</label>
<input type="text" name="nome"  class="ipn"/>
<br>
<label>Cpf:</label>
<input type="text" name="cpf"  class="ipe"/>
<br>
<label>Telefone:</label>
<input type="text" name="telefone"  class="ipe"/>

<input type="submit" name="cadastrar" value="Cadastrar Morador" class="ips"/>
</fieldset>
     <a href="listaMorador.jsp">Lista de Moradores</a>    
</form>
    </body>
</html>
