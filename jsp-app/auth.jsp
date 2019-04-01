<html>
    <body>
        <%
        String username=request.getParameter("uname");
        String password=request.getParameter("password");
        if(username.equals("admin") && password.equals("admin")){
            out.print("<h1>Welcome to Swabhav "+username+"</h1>");
        }
        else{
            out.print("<p style='color: red'>Invalid User!! <a href='login.html'>Login Again</a></p>");
        }
        %>
    </body>
</html>