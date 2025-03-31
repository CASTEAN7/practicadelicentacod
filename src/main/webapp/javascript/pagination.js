document.addEventListener("DOMContentLoaded", function () {
    const rowsPerPage = 10;
    const table = document.querySelector("table tbody");
    const rows = table.querySelectorAll("tr");
    const totalPages = Math.ceil(rows.length / rowsPerPage);
    let currentPage = 1;

    function displayPage(page) {
        rows.forEach((row, index) => {
            row.style.display = (index >= (page - 1) * rowsPerPage && index < page * rowsPerPage) ? "" : "none";
        });
        document.getElementById("prevPage").disabled = page === 1;
        document.getElementById("nextPage").disabled = page === totalPages;
    }

    document.getElementById("prevPage").addEventListener("click", function () {
        if (currentPage > 1) {
            currentPage--;
            displayPage(currentPage);
        }
    });

    document.getElementById("nextPage").addEventListener("click", function () {
        if (currentPage < totalPages) {
            currentPage++;
            displayPage(currentPage);
        }
    });

    displayPage(currentPage);
});