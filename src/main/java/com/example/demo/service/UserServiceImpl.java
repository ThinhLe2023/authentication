package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository repository;
    @Override
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public  boolean getValuationUser(User criteria) {
        User user = repository.findByUsername(criteria.getUsername());
        if(null == user) {
            return false; //not found user
        }

        if(user.getPassword().equals(criteria.getPassword())){
            return true;
        }
        return false;
    }
}
