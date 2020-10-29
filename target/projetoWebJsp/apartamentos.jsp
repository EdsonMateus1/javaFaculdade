<%-- 
    Document   : apartamentos
    Created on : 28/10/2020, 20:53:24
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apartamentos</title>
    </head>
    <body>
        <form method="post" action="InsereA.jsp" >
            <fieldset>
                <legend>Cadastro de Apartamentos</legend>
                <label>Numero:</label><br>
                <input type="text" name="numero"  class="ipn"/>
                <br>
                <label>Andar:</label><br>
                <input type="text" name="andar"  class="ipe"/>
                <br>
                <label>Bloco:</label><br>
                <input type="text" name="bloco"  class="ipe"/>
                 <br>
                <label>Quartos:</label><br>
                <input type="text" name="quartos"  class="ipe"/>
                <br>
                <input type="submit" name="cadastrar" value="Cadastrar Apartamento" class="ips"/>
            </fieldset>
           
        </form>
    </body>
</html>
