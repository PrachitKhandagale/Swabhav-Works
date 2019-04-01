<%@ page import = "java.io.*,java.util.*" %>
<html>

<body>
    <a href="application.jsp">Application</a>
    <a href="session.jsp">Session</a>
    <%

    Integer hitsCount = (Integer)application.getAttribute("hitCounter");

    if( hitsCount ==null || hitsCount == 0 ) {       
        hitsCount = 1;
    } else {
        hitsCount += 1;
    }
        application.setAttribute("hitCounter", hitsCount);
    %>

    <p>Old Counter:<%= hitsCount-1%></p>
    <p>New Counter: <%= hitsCount%></p>

</body>

</html>