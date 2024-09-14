function createPerson() {
    let name = document.getElementById('name').value;
    let age = parseInt(document.getElementById('age').value);

    if (name === "" || isNaN(age)) {
        alert('Please enter valid name and age.');
        return;
    }

    // Create person object
    let person = {
        name: name,
        age: age,
        details: function() {
            return `Name: ${this.name}, Age: ${this.age}`;
        }
    };

    // Display person details
    document.getElementById('personInfo').innerHTML = `<strong>Person Details:</strong> ${person.details()}`;
}
