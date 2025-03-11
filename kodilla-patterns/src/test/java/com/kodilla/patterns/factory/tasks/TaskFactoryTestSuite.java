package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testCreateShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertNotNull(task);
        assertEquals("Shopping Task", task.getTaskName());
        task.executeTask();
        assertTrue(task.isTaskExecuted());

    }
    @Test
    void testCreatePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        //Then
        assertNotNull(task);
        assertEquals("Painting Task", task.getTaskName());
        task.executeTask();
        assertTrue(task.isTaskExecuted());

    }
    @Test
    void testCreateDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        //Then
        assertNotNull(task);
        assertEquals("Driving Task", task.getTaskName());
        task.executeTask();
        assertTrue(task.isTaskExecuted());

    }
}