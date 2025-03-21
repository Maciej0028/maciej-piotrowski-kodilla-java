package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("tasklist1", "Its tasklist number one");

        //when
        taskListDao.save(taskList);
        Optional<TaskList> readTaskList = taskListDao.findByListName("tasklist1");

        //then
        assertTrue(readTaskList.isPresent());

        //CleanUp
        taskListDao.deleteById(readTaskList.get().getId());
    }
}
