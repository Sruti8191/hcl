<jsp:useBean id="user" class = "model.User"></jsp:useBean>
<jsp:useBean id="ud" class = "dao.UserDao"></jsp:useBean>

<%--
     String userName = request.getParameter("userName");
     String userPassword = request.getParameter("userPassword");
--%>
<%-- If we doesn't want to get Parameter then We have Param Keyword in jsp for get variables --%>

<jsp:setProperty property="userName" name="user" param = "userName"/>
<jsp:setProperty property="userPassword" name="user" param = "userPassword"/>

<%--
    for this code we have jsp:forward tag
    String res = ud.validate(user);
    response.sendRedirect(res);
--%>

<jsp:forward page="<%= ud.validate(user) %>"></jsp:forward>