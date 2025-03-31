<%-- 
    Document   : cmspacientcons
    Created on : Feb 12, 2025, 6:48:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/programare.css" rel="stylesheet" >
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="cmscommon/cmsmenupacient.jspf"%>
        <div class="container">
            <h2>Appointments</h2>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Pacient</th>
                        <th>Doctor</th>
                        <th>Domeniu</th>
                        <th>Data Programarii</th>
                        <th>Adresa</th>
                        <th>Pret</th>
                        <th>Statut</th>
                    </tr>
                </thead>
                <tbody>
                    <form:form modelAttribute="consultatie" method="post" action="cmspacicons" >
                        <c:forEach items="${consultatie}" var="consultatie">
                            <tr>
                                <td><c:out value="${consultatie.id}"/></td>
                                <td><c:out value="${consultatie.idPacient}"/></td>
                                <td><c:out value="${consultatie.idDoctor}"/></td>
                                <td><c:out value="${consultatie.domeniu}"/></td>
                                <td><c:out value="${consultatie.dataProgramarii}"/></td>
                                <td><c:out value="${consultatie.adresa}"/></td>
                                <td><c:out value="${consultatie.pret}"/></td>
                                <td><c:out value="${consultatie.statut}"/></td>
                            </tr>
                        </c:forEach>
                    </form:form>
                </tbody>
            </table>

            <!--            <div class="pagination">
                            <button id="prevPage">Previous</button>
                            <span class="page-info" id="pageInfo">Page 1 of 1</span>
                            <button id="nextPage">Next</button>
                        </div>-->
            <div>
                <p>Total Consultatii: ${totalConsultatii}</p>
                <p>Page ${currentPage + 1} of ${totalPages}</p>

                 Previous button 
                <c:if test="${currentPage > 0}">
                    <a href="/consultatii?idPacient=${idPacient}&page=${currentPage - 1}">Previous</a>
                </c:if>

                 Next button 
                <c:if test="${currentPage < totalPages - 1}">
                    <a href="/consultatii?idPacient=${idPacient}&page=${currentPage + 1}">Next</a>
                </c:if>
            </div>
        </div>
        <%@include  file="cmscommon/footer.jspf"%>
    </body>
</html>
