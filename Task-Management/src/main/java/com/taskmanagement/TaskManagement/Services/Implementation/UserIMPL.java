package com.taskmanagement.TaskManagement.Services.Implementation;

import com.taskmanagement.TaskManagement.Dto.LoginDTO;
import com.taskmanagement.TaskManagement.Dto.UserDTO;
import com.taskmanagement.TaskManagement.Entity.User;
import com.taskmanagement.TaskManagement.Repo.UserRepo;
import com.taskmanagement.TaskManagement.Services.UserService;
import com.taskmanagement.TaskManagement.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        userRepo.save(user);
        return user.getUserName();

    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> employee = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    // login success we can do create crud operations

                    return new LoginResponse("Login Success", true);
                    } else {
                        return new LoginResponse("Login Failed", false);
                    }
                } else {
                    return new LoginResponse("password Not Match", false);
                }
            }else {
                return new LoginResponse("Email not exits", false);
            }
    }
}
