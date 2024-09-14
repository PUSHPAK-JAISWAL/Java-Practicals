// User object with validation methods
let user = {
    validateName: function(name) {
        return name.trim().length > 0;
    },
    validateAge: function(age) {
        return !isNaN(age) && age > 0 && age <= 100;
    }
};

// Function to validate the form
function validateForm() {
    let name = document.getElementById('name').value;
    let age = parseInt(document.getElementById('age').value);

    let isValidName = user.validateName(name);
    let isValidAge = user.validateAge(age);

    let result = '';
    if (!isValidName) {
        result += 'Invalid Name!<br>';
    }
    if (!isValidAge) {
        result += 'Invalid Age! Age must be between 1 and 100.<br>';
    }

    if (isValidName && isValidAge) {
        result = 'Form is valid!';
    }

    document.getElementById('result').innerHTML = result;
}
