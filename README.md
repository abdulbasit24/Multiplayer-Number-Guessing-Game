# Multiplayer Number Guessing Game 🎮

A simple multiplayer number guessing game built using **Spring Boot** with **Spring WebFlux** for asynchronous communication, and a modern, responsive UI using **HTML**, **CSS**, and **JavaScript**.

In this game, players guess a number between 0 and 100. The game provides feedback on whether the guess is too low, too high, or correct. The game can be reset to start fresh at any time.

## Features

- 🔄 **Real-time Guess Feedback**: Each guess gets instant feedback from the server.
- 🎨 **Modern and Responsive UI**: The game adapts to both desktop and mobile devices.
- 🚀 **Backend with Spring WebFlux**: Asynchronous, non-blocking REST API using Spring WebFlux.
- 🔒 **Multiplayer Ready**: Multiple users can interact with the game via REST API endpoints.

## Technologies Used

- **Spring Boot** (Backend)
- **Spring WebFlux** (Asynchronous API)
- **HTML**, **CSS**, **JavaScript** (Frontend)
- **Fetch API** (For AJAX calls)

## Folder Structure

```bash
multiplayer-number-guess-game/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── com/
 │   │   │       └── example/
 │   │   │           └── game/
 │   │   │               ├── MultiplayerNumberGuessGameApplication.java
 │   │   │               ├── controller/
 │   │   │               │   └── NumberGuessController.java
 │   │   │               ├── model/
 │   │   │               │   └── Guess.java
 │   │   │               └── service/
 │   │   │                   └── NumberGuessService.java
 │   │   ├── resources/
 │   │   │   ├── application.properties
 │   │   │   ├── static/
 │   │   │   │   ├── index.html
 │   │   │   │   └── script.js
 ├── pom.xml
```

## How to Run the Project

### Prerequisites

Make sure you have the following installed:
- **Java 8+**
- **Maven 3.6+**

### Steps to Run

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-username/multiplayer-number-guess-game.git
   cd multiplayer-number-guess-game
   ```

2. **Build the Project**:

   Run the following Maven command to build the project:

   ```bash
   mvn clean install
   ```

3. **Run the Application**:

   Once the project is built, you can run the Spring Boot application with:

   ```bash
   mvn spring-boot:run
   ```

4. **Access the UI**:

   Open your web browser and go to:

   ```
   http://localhost:8081
   ```

   You’ll see the game interface where you can start guessing numbers.

## API Endpoints

The backend exposes the following REST API endpoints for interaction:

### 1. **Submit a Guess**: `/guess/play`

- **Method**: `POST`
- **Body**: JSON object with the guess
  ```json
  {
    "number": 45
  }
  ```
- **Response**: Feedback string (`"Too high"`, `"Too low"`, `"Correct! You guessed it right."`)

### 2. **Start a New Game**: `/guess/new`

- **Method**: `GET`
- **Response**: Resets the game and returns a message like `"New game started. Guess a number!"`

## Frontend UI

The front-end of the game is built using HTML, CSS, and JavaScript. It provides a clean and responsive interface for players to guess numbers and receive feedback. 

Key UI Features:
- **Input Field**: Enter the guess (number between 0 and 100).
- **Submit Button**: Sends the guess to the backend.
- **Feedback Display**: Shows whether the guess is too high, too low, or correct.
- **Start New Game Button**: Resets the game to start fresh.

### Screenshots

#### 1. Main Game Screen

![Game Screen](screenshots/game_screen.png)

#### 2. Responsive on Mobile

![Mobile View](screenshots/mobile_view.png)

## Future Improvements

- **Real-time Multiplayer**: Add WebSocket support for real-time guessing between multiple players.
- **Leaderboard**: Implement a scoring system to track the number of guesses and list players on a leaderboard.
- **AI Opponent**: Allow players to compete against an AI that also makes guesses.

## Contributing

Feel free to fork the repository and make improvements. Contributions are welcome through pull requests!

1. Fork it!
2. Create your feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Enjoy the game and happy guessing! 🎯
