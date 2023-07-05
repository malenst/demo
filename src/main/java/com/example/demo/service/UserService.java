package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Page<User> findAll(Pageable pageable);
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
