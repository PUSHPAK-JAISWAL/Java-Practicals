function calculateArea() {
    let radius = parseFloat(document.getElementById('radius').value);
    if (isNaN(radius) || radius <= 0) {
        alert('Please enter a valid positive radius');
        return;
    }

    let area = circleArea(radius);
    document.getElementById('result').innerHTML = `<strong>Area of Circle:</strong> ${area.toFixed(2)}`;
}

// User-defined function to calculate area of a circle
function circleArea(radius) {
    return Math.PI * Math.pow(radius, 2);
}
