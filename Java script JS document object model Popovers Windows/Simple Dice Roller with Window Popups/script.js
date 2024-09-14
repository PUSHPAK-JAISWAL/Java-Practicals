function rollDice() {
    const result = Math.floor(Math.random() * 6) + 1;
    document.getElementById('diceResult').innerHTML = 'You rolled a ' + result;
    
    setTimeout(() => {
        window.open('', '', 'width=200,height=100').document.write('<p>You rolled a ' + result + '</p>');
    }, 500);
}
