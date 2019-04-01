<%
        String bgcolor="red";
        String color=request.getParameter("colour");
        Cookie cookie=new Cookie("colour",color);
        cookie.setMaxAge(60*10);
        response.addCookie(cookie); 
%>
<html>

<body bgcolor="<%= cookie.getValue() %>">
    <form>
        <input type="text" name="colour">
    </form>
</body>

</html>