package com.justinbellamy.strategyexample;

public class StrategyExample {
    public static void main(String[] args) {
        ExerciseContext context = new ExerciseContext(new JoggingStrategy());
        System.out.println("30 minutes of running burns about " + context.executeStrategy(30) + " calories.");

        context = new ExerciseContext(new SwimmingStrategy());
        System.out.println("30 minutes of swimming burns about " + context.executeStrategy(30) + " calories.");
    }
}
