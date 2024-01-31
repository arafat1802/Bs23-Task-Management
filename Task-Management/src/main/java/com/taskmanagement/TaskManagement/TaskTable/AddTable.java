package com.taskmanagement.TaskManagement.TaskTable;


import com.taskmanagement.TaskManagement.Dto.TaskDTO;
import com.taskmanagement.TaskManagement.Repo.TaskRepo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class AddTable implements TaskCrud{

    TaskRepo taskRepo;
    @Override
    @PostMapping(path = "/task")
    public void addTask(TaskDTO task) {
        TaskTable task1 = new TaskTable(
                task.getTitle(),
                task.getDescription(),
                task.getStatus()
        );

        taskRepo.save(task1);
    }

}
