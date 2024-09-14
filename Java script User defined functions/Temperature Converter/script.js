function convertTemperature() {
    let temp = parseFloat(document.getElementById('temperature').value);
    let scale = document.getElementById('scale').value;

    if (isNaN(temp)) {
        alert('Please enter a valid temperature');
        return;
    }

    let convertedTemp;
    if (scale === 'C') {
        convertedTemp = celsiusToFahrenheit(temp);
        document.getElementById('result').innerHTML = `<strong>Converted Temperature:</strong> ${convertedTemp.toFixed(2)} °F`;
    } else {
        convertedTemp = fahrenheitToCelsius(temp);
        document.getElementById('result').innerHTML = `<strong>Converted Temperature:</strong> ${convertedTemp.toFixed(2)} °C`;
    }
}

// User-defined function to convert Celsius to Fahrenheit
function celsiusToFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
}

// User-defined function to convert Fahrenheit to Celsius
function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}
