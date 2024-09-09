package com.example.game.service;

import com.example.game.model.Guess;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Random;

@Service
public class NumberGuessService {

    private int numberToGuess;
    private static final int MAX_NUMBER = 100;

    public NumberGuessService() {
        this.numberToGuess = new Random().nextInt(MAX_NUMBER);
    }

    public Mono<String> processGuess(Guess guess) {
        int playerGuess = guess.getNumber();
        if (playerGuess > numberToGuess) {
            return Mono.just("Lower!");
        } else if (playerGuess < numberToGuess) {
            return Mono.just("Higher!");
        } else {
            return Mono.just("Correct! You guessed it right.");
        }
    }

    public Mono<String> startNewGame() {
        this.numberToGuess = new Random().nextInt(MAX_NUMBER);
        return Mono.just("New game started! Guess the number between 0 and " + MAX_NUMBER);
    }
}
