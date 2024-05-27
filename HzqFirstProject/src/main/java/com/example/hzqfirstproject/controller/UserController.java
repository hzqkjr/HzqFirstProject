package com.example.hzqfirstproject.controller;

import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.User;
import com.example.hzqfirstproject.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：" + userService.getUsers().toString());
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Fetching user by id: " + id);
        return userService.getUserById(id);
    }

    @PostMapping()
    public int insert(@RequestBody User user){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Inserting new user: " + user.toString());
        return userService.InsertUser(user);
    }

    @PutMapping()
    public int update(@RequestBody User user){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Updating user with id: " + user.getId() + ", " + user.toString());
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Deleting user with id: " + id);
        return userService.delete(id);
    }


    @GetMapping("/getUserInfo")
    public List<UserInfo> getUserInfo(){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Fetching user info");
        return userService.getUserInfo();
    }

    @PostMapping("/insertUsers")
    public int insertUsers(@RequestBody List<User> userList){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Inserting multiple users: " + userList.toString());
        return userService.insertUsers(userList);
    }

    @DeleteMapping("/deleteUsers")
    public int deleteUsers(@RequestBody List<Integer> idList){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Deleting multiple users: " + idList.toString());
        return userService.deleteUsers(idList);
    }

    @PutMapping("/updateBatch")
    public int updateBatch(@RequestBody List<User> userList){
        Logger logger = Logger.getLogger(UserController.class);
        logger.info("传来参数：Updating multiple users: " + userList.toString());
        return userService.updateBatch(userList);
    }
}
