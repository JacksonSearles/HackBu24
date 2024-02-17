package com.example.workout; // Adjust the package name as needed

public class Workout {   

    // Declaring name of the workout (Push Day, Pull Day, Leg Day)
    private final String name;
    // Declaring list made up of the exersizes (e.g. bench, fly, inclined bnech)
    private final Exercise[] workout;

    // Constructor, create an instance of a workout (e.g create a Push Day)
    Workout(String name)
    {
        // Name of the workout (Push Day, Pull Day, Leg Day)
        this.name = name;
        // List made up of the exercizes (e.g. bench, fly, inclined bnech)
        workout = new Exercise[3];
    }

    // Gets the exercise (e.g. bench, fly, inclined bench) from Exersize.java
    public Exercise[] getExcersize()
    {
        // place holder, grab the exercize from Exersize.java
        return workout;
    }

    // Adds this excercise to the current workout array  (e.g. add 'bench' to 'Push Day')
    public void addExcersize()
    {
        // add the exercise to the workout array
    }

    // Gets the name of the workout (e.g. Leg Day, Push Day, Pull Day)
    public String getName()
    {
        return name;
    }

    // Gets the workout (e.g. retrieve the Pull Day)
    public Exercise[] getWorkout()
    {
        return workout;
    }
}