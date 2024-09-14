let clicks = 0;
let time = 10;
let timerId;

function startGame() {
    clicks = 0;
    time = 10;
    document.getElementById('counter').innerHTML = 'Clicks: 0';
    document.getElementById('timer').innerHTML = 'Time: 10';
    
    document.getElementById('startButton').innerHTML = 'Click Me!';
    document.getElementById('startButton').onclick = () => countClicks();
    
    timerId = setInterval(() => {
        time--;
        document.getElementById('timer').innerHTML = 'Time: ' + time;
        if (time === 0) {
            endGame();
        }
    }, 1000);
}

function countClicks() {
    clicks++;
    document.getElementById('counter').innerHTML = 'Clicks: ' + clicks;
}

function endGame() {
    clearInterval(timerId);
    alert('Time is up! You clicked ' + clicks + ' times.');
    document.getElementById('startButton').innerHTML = 'Restart Game';
    document.getElementById('startButton').onclick = startGame;
}
