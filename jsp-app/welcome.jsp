<html>

<body>
    <% out.print("welcome to jsp"); %><br>
    <% 
        String name=request.getParameter("developer");
         
         for(int i = 1; i <=6; i++) { 
            if(name!=null && !name.equals("null") && !name.equals("")){
            out.println("<h"+i+">Welcome to Jsp, "+name+"</h"+i+">");
         } 
         else{
            out.println("<h"+i+">Welcome to Jsp</h"+i+">");
         }
        }
        %>

</body>

</html>