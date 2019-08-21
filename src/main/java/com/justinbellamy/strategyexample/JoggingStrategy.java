package com.justinbellamy.strategyexample;

public class JoggingStrategy implements ExerciseStrategy {
    public int exercise(int minutes) {
        return (minutes * 11);
    }
}
