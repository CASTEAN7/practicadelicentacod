// Sample data for each location.
// Update the mapUrl with your actual Google Maps embed link for each location.
const locationsData = {
    1: {
        mapUrl: "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2718.8599078225134!2d28.853719775852102!3d47.04297972672893!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40c97c560b2e237b%3A0xaca29f60009ef029!2sStrada%20Bogdan%20Voievod%207%2C%20MD-2068%2C%20Chi%C8%99in%C4%83u%2C%20Moldova!5e0!3m2!1sen!2s!4v1738769500305!5m2!1sen!2s"
//        , // Replace with actual URL
//        doctors: [
//            {}
//        ]
    },
    2: {
        mapUrl: "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2722.09646769716!2d28.86568397584836!3d46.979439831076135!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40c9798bbf626901%3A0x60aff13caa1ef435!2sInvitro%20Diagnostics!5e0!3m2!1sen!2s!4v1738771417637!5m2!1sen!2s" 
//        doctors: [
//            {fullName: "Dr. Alan Brown", domain: "Neurology", workHours: "8:30 AM - 4:30 PM", workDays: "Monday - Friday"}
//        ]
    },
    3: {
        mapUrl:"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2718.3105773787397!2d28.86197247585278!3d47.05375762599105!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40c97ce33d2a579d%3A0x403b3a41d3868845!2sBulevardul%20Moscova%2015%2C%20Chi%C8%99in%C4%83u%2C%20Moldova!5e0!3m2!1sen!2s!4v1738771827771!5m2!1sen!2s"
//        doctors: [
//            {fullName: "Dr. Carol White", domain: "Pediatrics", workHours: "10:00 AM - 6:00 PM", workDays: "Monday - Friday"}
//        ]
    },
    4: {
        mapUrl: "https://www.google.com/maps/embed?pb=!1m18...location4"
//        doctors: [
//            {fullName: "Dr. Michael Green", domain: "Orthopedics", workHours: "9:00 AM - 5:00 PM", workDays: "Monday - Friday"}
//        ]
    },
    5: {
        mapUrl: "https://www.google.com/maps/embed?pb=!1m18...location5"
//        doctors: [
//            {fullName: "Dr. Susan Black", domain: "Gynecology", workHours: "8:00 AM - 4:00 PM", workDays: "Monday - Friday"}
//        ]
    },
    6: {
        mapUrl: "https://www.google.com/maps/embed?pb=!1m18...location6"
//        doctors: [
//            {fullName: "Dr. Robert Blue", domain: "Ophthalmology", workHours: "10:00 AM - 6:00 PM", workDays: "Monday - Friday"}
//        ]
    }
};


// Open modal and update its content based on the location clicked.
function openModal(locationId) {
    const modal = document.getElementById('modal');
    modal.style.display = "block";

    // Set the map iframe source.
    const mapIframe = document.getElementById('map-iframe');
    mapIframe.src = locationsData[locationId].mapUrl;

    // Populate the doctors list.
    const doctorsListDiv = document.getElementById('doctors-list');
    
//    doctorsListDiv.innerHTML = '<h3>Doctors at this location</h3>';
//    locationsData[locationId].doctors.forEach(function (doctor) {
//        const doctorDiv = document.createElement('div');
//        doctorDiv.classList.add('doctor');
//        doctorDiv.innerHTML = `<strong>${doctor.fullName}</strong><br>
//                                           Domain: ${doctor.domain}<br>
//                                           Hours: ${doctor.workHours}<br>
//                                           Days: ${doctor.workDays}`;
//        doctorsListDiv.appendChild(doctorDiv);
//    });
}

// Close the modal and reset the iframe source.
function closeModal() {
    const modal = document.getElementById('modal');
    modal.style.display = "none";
    const mapIframe = document.getElementById('map-iframe');
    mapIframe.src = ""; // This stops any media playing inside the iframe.
}

// Close the modal if the user clicks outside the modal content.
window.onclick = function (event) {
    const modal = document.getElementById('modal');
    if (event.target == modal) {
        closeModal();
    }
}