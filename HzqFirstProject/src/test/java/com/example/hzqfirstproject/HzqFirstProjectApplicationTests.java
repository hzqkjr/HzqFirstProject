package com.example.hzqfirstproject;

import com.example.hzqfirstproject.dto.DeptInfo;
import com.example.hzqfirstproject.entity.Department;
import com.example.hzqfirstproject.entity.User;
import com.example.hzqfirstproject.mapper.DeptMapper;
import com.example.hzqfirstproject.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HzqFirstProjectApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DeptMapper deptMapper;
    @Test
    void contextLoads() {
    }

    @Test
    void getUser(){
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }

    @Test
    void getDeptInfo(){
        List<DeptInfo> deptInfos = deptMapper.DeptInfo(1);
        System.out.println(deptInfos);
    }

    @Test
    void selectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    void insertToUser(){
        User user = new User(null,"1212","12121",1,"1990-10-17",1);
        System.out.println(userMapper.insertToUser(user));
    }

    @Test
    void update(){
        User user = new User(20,"11111","12121",1,"1990-10-17",1);
        System.out.println(userMapper.update(user));
    }

    @Test
    void delete(){
        System.out.println(userMapper.delete(20));
    }

    @Test
    void insertUsers(){
        User user1 = new User(null,"1212","12121",1,"1990-10-17",1);
        User user2 = new User(null,"1212","12121",1,"1990-10-17",1);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        System.out.println(userMapper.insertUsers(userList));
    }

    @Test
    void updateBatch(){
        User user1 = new User(21,"2222","12121",1,"1990-10-17",1);
        User user2 = new User(22,"3333","12121",1,"1990-10-17",1);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        System.out.println(userMapper.updateBatch(userList));
    }

    @Test
    void deleteUsers(){
        List<Integer> u = new ArrayList<>();
        u.add(23);
        u.add(24);
        System.out.println(userMapper.deleteUsers(u));
    }

    @Test
    void selectAll(){
        System.out.println(deptMapper.selectAll());
    }

    @Test
    void selectById1(){
        System.out.println(deptMapper.selectById(1));
    }

    @Test
    void insertToUser1(){
        System.out.println(deptMapper.insertToUser(new Department(null, "111", "111", "111")));
    }

    @Test
    void update1(){
        System.out.println(deptMapper.update(new Department(8, "121", "111", "111")));
    }

    @Test
    void delete1(){
        System.out.println(userMapper.delete(8));
    }

    @Test
    void insertDept(){
        Department d1 = new Department(null, "111", "111", "111");
        Department d2 = new Department(null, "111", "111", "111");
        List<Department> departments = new ArrayList<>();
        departments.add(d1);
        departments.add(d2);
        System.out.println(deptMapper.insertDept(departments));
    }

    @Test
    void updateBatch1(){
        Department d1 = new Department(9, "2222", "111", "111");
        Department d2 = new Department(10, "2222", "111", "111");
        List<Department> departments = new ArrayList<>();
        departments.add(d1);
        departments.add(d2);
        System.out.println(deptMapper.updateBatch(departments));
    }

    @Test
    void deleteDept(){
        List<Integer> u = new ArrayList<>();
        u.add(9);
        u.add(10);
        System.out.println(deptMapper.deleteDept(u));
    }
}
