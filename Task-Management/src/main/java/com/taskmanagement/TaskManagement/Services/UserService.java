package com.taskmanagement.TaskManagement.Services;

import com.taskmanagement.TaskManagement.Dto.UserDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public interface UserService {
    String addUser(UserDTO userDTO);
}
