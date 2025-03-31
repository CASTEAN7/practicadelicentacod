document.addEventListener("DOMContentLoaded", function() {
    // Get the input elements
    const firstNameInput = document.querySelector('input[name="firstname"]');
    const lastNameInput = document.querySelector('input[name="lastname"]');
    const usernameInput = document.querySelector('input[name="username"]');

    // Function to update the username
    function updateUsername() {
        // Concatenate first and last name and set the value to the username input
        usernameInput.value = firstNameInput.value.trim() + lastNameInput.value.trim();
        // Optionally, you can disable the username input if needed
        usernameInput.disabled = false; // If you want to enable the input instead of disable it
    }

    // Event listeners to trigger the username update when either field changes
    firstNameInput.addEventListener('input', updateUsername);
    lastNameInput.addEventListener('input', updateUsername);

    // Initialize the username in case values already exist
    updateUsername();
});