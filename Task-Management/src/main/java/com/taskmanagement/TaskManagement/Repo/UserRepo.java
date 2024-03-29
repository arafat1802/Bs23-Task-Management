package com.taskmanagement.TaskManagement.Repo;

import com.taskmanagement.TaskManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@EnableJpaRepositories
@Repository
@Service
public interface UserRepo extends JpaRepository<User, String> {
    Optional<User> findOneByEmailAndPassword(String email, String password);
    User findByEmail(String email);
}
