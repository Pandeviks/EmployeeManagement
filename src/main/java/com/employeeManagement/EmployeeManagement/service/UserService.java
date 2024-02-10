package com.employeeManagement.EmployeeManagement.service;

import com.employeeManagement.EmployeeManagement.dto.UserRegistrationDto;
import com.employeeManagement.EmployeeManagement.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
