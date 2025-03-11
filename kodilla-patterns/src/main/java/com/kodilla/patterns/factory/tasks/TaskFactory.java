package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPINGTASK = "SHOPPING TASK";
    public final static String PAINTINGTASK = "PAINTING TASK";
    public final static String DRIVINGTASK = "DRIVING TASK";

    public Task createTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Shopping Task", "Olives", 10);
            case PAINTINGTASK -> new PaintingTask("Painting Task", "Blue", "Walls");
            case DRIVINGTASK -> new DrivingTask("Driving Task", "Warsaw", "Volvo");
            default -> null;
        };
    }
}
