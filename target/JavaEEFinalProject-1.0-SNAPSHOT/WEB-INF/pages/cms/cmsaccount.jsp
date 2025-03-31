<%-- 
    Document   : cmsaccount
    Created on : Feb 5, 2025, 6:27:57 AM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page import="com.iucosoft.javaeefinalproject.entities.Doctor"%>
<%@page import="com.iucosoft.javaeefinalproject.entities.Pacient"%>
<%@page import="com.iucosoft.javaeefinalproject.entities.User"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/css/accountedit.css" rel="stylesheet" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <%@include  file="cmscommon/cmsmenupacient.jspf"%>
        <div class="edit-wrapper">
        <form:form modelAttribute="pacient" method="post" action="cmsaccount" >
            <div class="input-field">
                <form:input path="id" type="hidden" />
            </div>
            <div class="input-field">
                <form:input path="nume" placeholder="Nume" />
            </div>
            <div class="input-field">
                <form:input path="prenume" placeholder="Prenume" />
            </div>
            <div class="input-field">
                <form:input type="date" path="dataNasterii" placeholder="Birth Date"   />
            </div>
            <div class="input-field">
                <form:input path="telefon" maxlength="10"  placeholder="Telefon" />
            </div>
            <div class="input-field">
                <form:input path="email" placeholder="Email" />
            </div>
            <div class="input-field">
                <form:input path="idUser" type="hidden"  />
            </div>
            <div class="input-button">
                <input type="submit" value="Save" name="action" />
            </div>

            <div class="input-button">
                    <a href="cmspacicons">Programari</a></p>
                </div>
        </form:form>
            </div>
        <%@include  file="cmscommon/footer.jspf"%>
    </body>
</html>
