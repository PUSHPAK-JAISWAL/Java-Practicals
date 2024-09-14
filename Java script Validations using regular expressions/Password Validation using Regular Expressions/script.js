// Function to validate password using regular expression
function validatePassword() {
    let password = document.getElementById('password').value;
    let passwordPattern = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/; 
    // Must contain 8 characters, one letter, one number, and one special character

    if (passwordPattern.test(password)) {
        document.getElementById('result').innerHTML = 'Valid Password!';
    } else {
        document.getElementById('result').innerHTML = 'Invalid Password! Password must be at least 8 characters long, with at least one letter, one number, and one special character.';
    }
}
