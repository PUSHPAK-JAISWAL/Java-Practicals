let targetNumber = Math.floor(Math.random() * 100) + 1;

function submitGuess() {
    let guess = document.getElementById('guessInput').value;
    guess = parseInt(guess);
    
    if (guess === targetNumber) {
        alert('Congratulations! You guessed the number.');
        restartGame();
    } else if (guess > targetNumber) {
        document.getElementById('feedback').innerHTML = 'Too high! Try again.';
    } else {
        document.getElementById('feedback').innerHTML = 'Too low! Try again.';
    }
}

function restartGame() {
    targetNumber = Math.floor(Math.random() * 100) + 1;
    document.getElementById('guessInput').value = '';
    document.getElementById('feedback').innerHTML = '';
}
