package com.taskmanagement.TaskManagement.TaskTable;

import jakarta.persistence.*;

@Entity
@Table(name = "task_table")
public class TaskTable {
    @Id
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String status;

    public TaskTable(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public TaskTable() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "TaskTable{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}


