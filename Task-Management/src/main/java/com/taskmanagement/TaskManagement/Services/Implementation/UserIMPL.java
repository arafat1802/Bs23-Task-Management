package com.taskmanagement.TaskManagement.Services.Implementation;

import com.taskmanagement.TaskManagement.Dto.UserDTO;
import com.taskmanagement.TaskManagement.Entity.User;
import com.taskmanagement.TaskManagement.Repo.UserRepo;
import com.taskmanagement.TaskManagement.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserName(),
                userDTO.getEmail(),
                //userDTO.getPassword()
                this.passwordEncoder.encode(userDTO.getPassword())
        );
        //return "fuck you";
        userRepo.save(user);
        return user.getUserName();

    }

}
