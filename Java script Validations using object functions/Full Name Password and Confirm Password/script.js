// User object with validation methods
let user = {
    validateFullName: function(fullName) {
        return fullName.trim().length >= 3;
    },
    validatePassword: function(password) {
        return password.length >= 6;
    },
    confirmPassword: function(password, confirmPassword) {
        return password === confirmPassword;
    }
};

// Function to validate the form
function validateForm() {
    let fullName = document.getElementById('fullName').value;
    let password = document.getElementById('password').value;
    let confirmPassword = document.getElementById('confirmPassword').value;

    let isValidName = user.validateFullName(fullName);
    let isValidPassword = user.validatePassword(password);
    let passwordsMatch = user.confirmPassword(password, confirmPassword);

    let result = '';
    if (!isValidName) {
        result += 'Full Name must be at least 3 characters long.<br>';
    }
    if (!isValidPassword) {
        result += 'Password must be at least 6 characters long.<br>';
    }
    if (!passwordsMatch) {
        result += 'Passwords do not match.<br>';
    }

    if (isValidName && isValidPassword && passwordsMatch) {
        result = 'Form is valid!';
    }

    document.getElementById('result').innerHTML = result;
}
