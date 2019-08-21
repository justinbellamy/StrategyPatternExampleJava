package com.justinbellamy.strategyexample;

public class ExerciseContext {
    private ExerciseStrategy strategy;

    public ExerciseContext(ExerciseStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int minutes) {
        return strategy.exercise(minutes);
    }
}
