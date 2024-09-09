package com.example.game.controller;

import com.example.game.model.Guess;
import com.example.game.service.NumberGuessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/guess")
public class NumberGuessController {

    private final NumberGuessService guessService;

    @Autowired
    public NumberGuessController(NumberGuessService guessService) {
        this.guessService = guessService;
    }

    @PostMapping("/play")
    public Mono<String> guessNumber(@RequestBody Guess guess) {
        return guessService.processGuess(guess);
    }

    @GetMapping("/new")
    public Mono<String> startNewGame() {
        return guessService.startNewGame();
    }
}
