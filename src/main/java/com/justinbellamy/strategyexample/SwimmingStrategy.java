package com.justinbellamy.strategyexample;

public class SwimmingStrategy implements ExerciseStrategy {
    public int exercise(int minutes) {
        return (minutes * 7);
    }
}
