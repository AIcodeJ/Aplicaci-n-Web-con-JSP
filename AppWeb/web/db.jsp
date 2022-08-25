<%-- 
    Document   : db
    Created on : 22 ago. 2022, 21:09:20
    Author     : Alexis
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="Figura.Triangulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estos son los resultados</h1>
        <%
            String B = request.getParameter("B");
            String H = request.getParameter("H");
            
            Triangulo t = new Triangulo(B,H);
            t.Area();
            double result = t.getResult();  
            Triangulo tt = new Triangulo(B,H);
            tt.Perimeter();
            double resultado = tt.getResult();  
        %>
        
        Valor del área es: <%=result%><br><br>
        Valor del perimetro es: <%=resultado%><br><br>
        <form action="${pageContext.request.contextPath}/index.html" method="post">
            <input type="submit" value="Back"/>
        </form>
    </body>
</html>
