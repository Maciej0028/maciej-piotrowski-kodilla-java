package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public void executeTask() {
        System.out.println("Executing driving task: " + taskName + " to " + where + " using " + using);
        isExecuted = true;
    }
    @Override
    public Boolean isTaskExecuted() {
        return isExecuted;
    }
}
