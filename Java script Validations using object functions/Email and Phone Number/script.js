// User object with validation methods
let user = {
    validateEmail: function(email) {
        let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailPattern.test(email);
    },
    validatePhone: function(phone) {
        let phonePattern = /^[0-9]{10}$/;
        return phonePattern.test(phone);
    }
};

// Function to validate the form
function validateForm() {
    let email = document.getElementById('email').value;
    let phone = document.getElementById('phone').value;

    let isValidEmail = user.validateEmail(email);
    let isValidPhone = user.validatePhone(phone);

    let result = '';
    if (!isValidEmail) {
        result += 'Invalid Email!<br>';
    }
    if (!isValidPhone) {
        result += 'Invalid Phone Number! Must be a 10-digit number.<br>';
    }

    if (isValidEmail && isValidPhone) {
        result = 'Form is valid!';
    }

    document.getElementById('result').innerHTML = result;
}
