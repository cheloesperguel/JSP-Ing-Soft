
<%@page import="html.Tablero"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Taller Practica</title>
    </head>
    <body>
            
            <%
                Tablero tabUno = new Tablero("black","white");
                Tablero tabDos = new Tablero("pink","blue");
                Tablero tabTres = new Tablero("red","green");
            %>   
            
            <div>
                <%=tabUno.dibujaTablero()%>
                <%=tabDos.dibujaTablero()%>
                <%=tabTres.dibujaTablero()%>
            </div>    
    </body>
</html>
