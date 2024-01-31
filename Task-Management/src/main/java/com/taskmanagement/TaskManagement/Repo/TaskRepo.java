package com.taskmanagement.TaskManagement.Repo;


import com.taskmanagement.TaskManagement.TaskTable.TaskTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
@EnableJpaRepositories
public interface TaskRepo extends JpaRepository<TaskTable, String> {

}
