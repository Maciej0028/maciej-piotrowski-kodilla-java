package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public void executeTask() {
        System.out.println("Executing painting task: " + taskName + " on " + whatToPaint + " in color " + color);
        isExecuted = true;
    }
    @Override
    public Boolean isTaskExecuted() {
        return isExecuted;
    }
}
