// Function to validate email using regular expression
function validateEmail() {
    let email = document.getElementById('email').value;
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Simple email pattern

    if (emailPattern.test(email)) {
        document.getElementById('result').innerHTML = 'Valid Email!';
    } else {
        document.getElementById('result').innerHTML = 'Invalid Email!';
    }
}
