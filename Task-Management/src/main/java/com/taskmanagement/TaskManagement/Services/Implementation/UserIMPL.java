package com.taskmanagement.TaskManagement.Services.Implementation;

import com.taskmanagement.TaskManagement.Dto.UserDTO;
import com.taskmanagement.TaskManagement.Entity.User;
import com.taskmanagement.TaskManagement.Repo.UserRepo;
import com.taskmanagement.TaskManagement.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public String addEmployee(UserDTO userDTO) {
        User user = new User(
                userDTO.getUserName(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userRepo.save(user);
        return user.getEmployeename();
    }
}
