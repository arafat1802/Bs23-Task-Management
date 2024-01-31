package com.taskmanagement.TaskManagement.Dto;


public class TaskDTO {
    private Long id;

    private String title;

    private String description;
    private Boolean status;

    public TaskDTO(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public TaskDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
