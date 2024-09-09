const feedbackElement = document.getElementById('feedback');

// Function to submit a guess
function submitGuess() {
    const guessInput = document.getElementById('guessInput').value;
    
    if (guessInput === '') {
        feedbackElement.textContent = "Please enter a number.";
        return;
    }

    fetch('/guess/play', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ number: parseInt(guessInput) })
    })
    .then(response => response.text())
    .then(result => {
        feedbackElement.textContent = result;
    })
    .catch(error => {
        console.error('Error:', error);
        feedbackElement.textContent = "Error communicating with the server.";
    });
}

// Function to start a new game
function startNewGame() {
    fetch('/guess/new')
    .then(response => response.text())
    .then(result => {
        feedbackElement.textContent = result;
        document.getElementById('guessInput').value = '';
    })
    .catch(error => {
        console.error('Error:', error);
        feedbackElement.textContent = "Error starting a new game.";
    });
}
