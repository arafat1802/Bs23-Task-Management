package com.taskmanagement.TaskManagement.TaskTable;


import com.taskmanagement.TaskManagement.Dto.TaskDTO;
import com.taskmanagement.TaskManagement.Repo.TaskRepo;


public class AddTable implements TaskCrud{

    private TaskRepo taskRepo;

    public String addTask(TaskDTO task) {

        TaskTable task1 = new TaskTable(
                task.getTitle(),
                task.getDescription(),
                task.getStatus()
        );
        taskRepo.save(task1);
        return  "hello";
//        return  task1.getTitle();
    }

}
