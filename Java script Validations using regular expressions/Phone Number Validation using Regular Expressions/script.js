// Function to validate phone number using regular expression
function validatePhone() {
    let phone = document.getElementById('phone').value;
    let phonePattern = /^[0-9]{10}$/; // Matches exactly 10 digits

    if (phonePattern.test(phone)) {
        document.getElementById('result').innerHTML = 'Valid Phone Number!';
    } else {
        document.getElementById('result').innerHTML = 'Invalid Phone Number!';
    }
}
