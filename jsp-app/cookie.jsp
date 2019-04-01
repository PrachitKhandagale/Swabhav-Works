<%
        String bgcolor="red";
        Cookie cookie=new Cookie("bgcolor",bgcolor);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie); 
%>
<html>

<body bgcolor="<%= cookie.getValue() %>">
    
</body>

</html>