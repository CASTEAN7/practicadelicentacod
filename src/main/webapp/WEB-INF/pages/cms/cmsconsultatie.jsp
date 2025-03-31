<%-- 
    Document   : cmsconsultatie
    Created on : Jan 19, 2025, 2:40:07 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/css/consultatie.css" rel="stylesheet" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="cmscommon/cmsmenupacient.jspf"%>

        <div class="card-container">
            <div class="card">
                <a href="cmsgeneric?name=Chirurgie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-droplet"></i> Chirurgie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Pediatrie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-person-breastfeeding"></i> Pediatrie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Neurologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-brain"></i> Neurologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Dermatologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-hand-holding-medical"></i> Dermatologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Oncologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-staff-snake"></i> Oncologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Traumatologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-kit-medical"></i> Traumatologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Cardiologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-heart"></i> Cardiologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Dietologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-receipt"></i> Dietologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Endocrinologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-hospital-user"></i> Endocrinologie</b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Alergologie">
                    <div class="container">
                        <h4><b><i class="fa-solid fa-lungs-virus"></i> Alergologie </b></h4>
                    </div>
                </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Endoscopie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-microscope"></i> Endoscopie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Ginecologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-user-nurse"></i> Ginecologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Oftalmologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-eye"></i> Oftalmologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=AnestezieSiReanimare">
                <div class="container">
                    <h4><b><i class="fa-solid fa-syringe"></i> Anestezie și Reanimare</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Kinetoterapie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-truck-medical"></i> Kinetoterapie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Reumatologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-person-cane"></i> Reumatologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Stomatologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-tooth"></i> Stomatologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=BoliInfecțioase">
                <div class="container">
                    <h4><b><i class="fa-solid fa-virus"></i> BoliInfecțioase</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Gastroenterologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-mortar-pestle"></i> Gastroenterologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=MedicinaInternă">
                <div class="container">
                    <h4><b><i class="fa-solid fa-stethoscope"></i> MedicinaInternă</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Otorinolaringologie(ORL)">
                <div class="container">
                    <h4><b><i class="fa-solid fa-user-doctor"></i> Otorinolaringologie(ORL)</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Ultrasonografie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-radiation"></i> Ultrasonografie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=Urologie">
                <div class="container">
                    <h4><b><i class="fa-solid fa-lungs"></i> Urologie</b></h4>
                </div>
                    </a>
            </div>
            <div class="card">
                <a href="cmsgeneric?name=GeneticaUmană">
                <div class="container">
                    <h4><b><i class="fa-solid fa-dna"></i> GeneticaUmană</b></h4>
                </div>
                    </a>
            </div>
        </div>
        <%@include  file="cmscommon/footer.jspf"%>
    </body>
</html>
