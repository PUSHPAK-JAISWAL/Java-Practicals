function calculateSquare() {
    let number = parseFloat(document.getElementById('number').value);
    if (isNaN(number)) {
        alert('Please enter a valid number');
        return;
    }

    let square = squareOf(number);
    document.getElementById('result').innerHTML = `<strong>Square:</strong> ${square}`;
}

// User-defined function to calculate square
function squareOf(num) {
    return num * num;
}
