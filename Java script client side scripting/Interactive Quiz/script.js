document.getElementById('quizForm').addEventListener('submit', function(event) {
    event.preventDefault();

    let q1 = document.querySelector('input[name="q1"]:checked');
    let q2 = document.querySelector('input[name="q2"]:checked');
    
    let score = 0;
    if (q1 && q1.value === "Paris") score++;
    if (q2 && q2.value === "4") score++;
    
    let result = document.getElementById('result');
    result.textContent = "You scored: " + score + "/2";
});
