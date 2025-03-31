document.addEventListener("DOMContentLoaded", function() {
    // Get the input elements
    const firstNameInput = document.querySelector('input[name="firstname"]');
    const lastNameInput = document.querySelector('input[name="lastname"]');
    const usernameInput = document.querySelector('input[name="username"]');

    // Function to update the username
    function updateUsername() {
        const firstName = firstNameInput.value.trim().toLowerCase();
        const lastName = lastNameInput.value.trim().toLowerCase();

        // Ensure both fields are not empty before generating a username
//        if (firstName && lastName) {
            // Create base username (first letter of first name + full last name)
            let generatedUsername = firstName.charAt(0) + lastName;

            // Set the username value to the input field
            usernameInput.value = generatedUsername;
//        }
    }

    // Event listeners to trigger the username update when either field changes
    firstNameInput.addEventListener('input', updateUsername);
    lastNameInput.addEventListener('input', updateUsername);
});
