function performOperations() {
    let num1 = parseFloat(document.getElementById('num1').value);
    let num2 = parseFloat(document.getElementById('num2').value);

    if (isNaN(num1) || isNaN(num2)) {
        alert('Please enter valid numbers.');
        return;
    }

    let results = [];
    results.push(`Sum: ${num1 + num2}`);
    results.push(`Difference: ${num1 - num2}`);
    results.push(`Product: ${num1 * num2}`);
    results.push(`Quotient: ${num1 / num2}`);
    results.push(`Is num1 greater than num2? ${num1 > num2}`);
    results.push(`Is num1 equal to num2? ${num1 === num2}`);

    let resultList = document.getElementById('resultList');
    resultList.innerHTML = '';
    results.forEach(result => {
        let li = document.createElement('li');
        li.classList.add('list-group-item');
        li.textContent = result;
        resultList.appendChild(li);
    });
}
