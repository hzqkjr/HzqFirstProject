package com.example.hzqfirstproject.service;

import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.User;
import com.example.hzqfirstproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.selectAll();
    }

    public User getUserById(Integer id){
        return userMapper.selectById(id);
    }

    public Integer InsertUser(User user){
        return userMapper.insertToUser(user);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int delete(Integer id){
        return userMapper.delete(id);
    }

    public List<UserInfo> getUserInfo(){
        return userMapper.getUserInfo();
    }

    public int insertUsers(List<User> userList){
        return userMapper.insertUsers(userList);
    }

    public int deleteUsers(List<Integer> idList){
        return userMapper.deleteUsers(idList);
    }

    public int updateBatch(List<User> userList){
        return userMapper.updateBatch(userList);
    }

}
