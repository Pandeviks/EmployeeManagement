package com.employeeManagement.EmployeeManagement.repository;

import com.employeeManagement.EmployeeManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

}
