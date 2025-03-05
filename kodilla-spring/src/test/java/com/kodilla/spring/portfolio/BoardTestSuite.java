package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;
    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //When
        toDoList.getTasks().add("task1");
        inProgressList.getTasks().add("task2");
        doneList.getTasks().add("task3");
        //Then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getDoneList().getTasks().size());

        assertEquals("task1", board.getToDoList().getTasks().getFirst());
        assertEquals("task2", board.getInProgressList().getTasks().getFirst());
        assertEquals("task3", board.getDoneList().getTasks().getFirst());
    }
}
