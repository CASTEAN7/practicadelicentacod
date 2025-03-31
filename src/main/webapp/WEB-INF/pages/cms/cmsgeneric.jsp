<%-- 
    Document   : cmsgeneric
    Created on : Jan 19, 2025, 3:21:58 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/generic.css" rel="stylesheet" >
        <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/calendar.js"></script>
         <title>${domeniu}</title>
    </head>
    <body >
        <%@include  file="cmscommon/cmsmenupacient.jspf"%>
        <div class="login-wrapper">
            <form action="cmsgeneric" id="cmsgeneric" method="POST">

                <div>
                    <h1>Domeniu ${domeniu}</h1>
                    <p>${info}</p>
                </div>

                <h2>Book an Appointment</h2>
                <!-- Month Selection (Dropdown) -->
                <div class="input-field">
                    <label for="monthSelector">Select a Month:</label>
                    <select id="monthSelector" name="month" onchange="loadCalendar()">
                        <!-- Options will be loaded by JS (current year, months only) -->
                    </select>
                </div>

                <!-- Calendar Display -->
                <div id="calendarDisplay" class="calendar-display">
                    <!-- The calendar grid will be dynamically created here -->
                </div>

                <!-- Time Selection Section -->
                <div class="input-field">
                    <!--<label for="time">Select a Time:</label>-->
                    <select id="time" name="time">
                        <!-- Times will be loaded by JS -->
                    </select>
                </div>

                <!-- Submit Button -->
                <button type="submit" name="action" value="submit">Submit</button>
            </form>
        </div>
        <%@include  file="cmscommon/footer.jspf"%>
    </body>
</html>
