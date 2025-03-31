<%-- 
    Document   : adresa
    Created on : Feb 5, 2025, 5:23:04 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
    <head>
        <title>Our Locations</title>
        <link href="${pageContext.request.contextPath}/css/adresa.css" rel="stylesheet" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/adresa.js"></script>
    </head>
    <body>
        <%@include  file="common/menu.jspf"%>
        <div class="locations-container">
            <!-- Location 1 -->
            <div class="location-card" data-location-id="1" onclick="openModal(1)">
                <h2>Strada Bogdan Voievod 7</h2>
                <p><strong>Working Hours:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
            <!-- Location 2 -->
            <div class="location-card" data-location-id="2" onclick="openModal(2)">
                <h2>Bd.Dacia, 47/2</h2>
                <p><strong>Working Hours:</strong> 8:30 AM - 4:30 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
            <!-- Location 3 -->
            <div class="location-card" data-location-id="3" onclick="openModal(3)">
                <h2>Bd.Moscovei, 15</h2>
                <p><strong>Working Hours:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
            <!-- Location 4 -->
            <div class="location-card" data-location-id="4" onclick="openModal(4)">
                <h2>Location 4</h2>
                <p><strong>Street:</strong> 101 First Blvd, City, Country</p>
                <p><strong>Working Hours:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
            <!-- Location 5 -->
            <div class="location-card" data-location-id="5" onclick="openModal(5)">
                <h2>Location 5</h2>
                <p><strong>Street:</strong> 202 Second Blvd, City, Country</p>
                <p><strong>Working Hours:</strong> 8:00 AM - 4:00 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
            <!-- Location 6 -->
            <div class="location-card" data-location-id="6" onclick="openModal(6)">
                <h2>Location 6</h2>
                <p><strong>Street:</strong> 303 Third Blvd, City, Country</p>
                <p><strong>Working Hours:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Working Days:</strong> Monday - Friday (Weekends closed)</p>
            </div>
        </div>

        <!-- Modal Popup -->
        <div id="modal" class="modal">
            <div class="modal-content">
                <span class="close" onclick="closeModal()">&times;</span>
                <div id="modal-map" class="map-container">
                    <!-- The map will be embedded here. The iframe src will be updated dynamically. -->
                    <iframe id="map-iframe" width="100%" height="100%" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                </div>
                <div class="doctors-list" id="doctors-list">
                    <!-- Doctor details will be injected here -->
                </div>
            </div>
        </div>
        <%@include  file="common/footer.jspf"%>
    </body>
</html>
