package it.develhope.noSQLexrcise11.controllers;

import it.develhope.noSQLexrcise11.entities.User;
import it.develhope.noSQLexrcise11.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
   private UserRepository userRepository;


    @PostMapping("")
    public User createUser(@RequestBody User user){
        user.setId(null);
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return  userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public User createUser(@PathVariable String id,@RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping
    private void deleteUser(@PathVariable String id){
         userRepository.deleteById(id);
    }

    }




