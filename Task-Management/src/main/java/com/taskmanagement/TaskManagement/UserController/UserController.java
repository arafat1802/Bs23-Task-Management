package com.taskmanagement.TaskManagement.UserController;

import com.taskmanagement.TaskManagement.Dto.LoginDTO;
import com.taskmanagement.TaskManagement.Dto.TaskDTO;
import com.taskmanagement.TaskManagement.Dto.UserDTO;
import com.taskmanagement.TaskManagement.Services.UserService;
import com.taskmanagement.TaskManagement.TaskTable.AddTable;
import com.taskmanagement.TaskManagement.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public String saveEmployee(@RequestBody UserDTO userDTO)
    {
        //return "hello";
        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        LoginResponse loginMessage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }

    //need to add session before accessing the task
    private AddTable addTable;
    @PostMapping(path = "/task")
    public String addTable(@RequestBody TaskDTO taskDTO){
        //return "xxx";
        String table = addTable.addTask(taskDTO);
        return table;
    }
}
