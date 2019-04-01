<html>

<body>
    <a href="application.jsp">Application</a>
    <a href="session.jsp">Session</a>
    
    <p>Old Counter for session:<%= (Integer)session.getAttribute("hitCounter")%></p>
    

    <p>Old Counter for application:<%= (Integer)application.getAttribute("hitCounter")%></p>
    
</body>

</html>