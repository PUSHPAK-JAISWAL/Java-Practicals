function calculateEvenSum() {
    let startNum = parseInt(document.getElementById('startNum').value);
    let endNum = parseInt(document.getElementById('endNum').value);

    if (isNaN(startNum) || isNaN(endNum) || startNum > endNum) {
        alert('Please enter valid numbers where the start number is less than or equal to the end number.');
        return;
    }

    let sum = 0;
    for (let i = startNum; i <= endNum; i++) {
        if (i % 2 === 0) {
            sum += i;
        }
    }

    document.getElementById('sumResult').innerHTML = `<strong>Sum of even numbers:</strong> ${sum}`;
}
