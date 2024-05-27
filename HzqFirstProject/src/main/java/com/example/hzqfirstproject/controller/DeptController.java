package com.example.hzqfirstproject.controller;

import com.example.hzqfirstproject.dto.DeptInfo;
import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.Department;
import com.example.hzqfirstproject.entity.User;
import com.example.hzqfirstproject.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class DeptController {

    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    @GetMapping("/getDeptInfo/{id}")
    public List<DeptInfo> getDeptInfo(@PathVariable Integer id){
        logger.info("Fetching department info for id: {}", id);
        return deptService.getDeptInfo(id);
    }

    @GetMapping()
    public List<Department> getUsers(){
        logger.info("Fetching all departments");
        return deptService.getUsers();
    }

    @GetMapping("/{id}")
    public Department getUserById(@PathVariable Integer id){
        logger.info("Fetching department by id: {}", id);
        return deptService.getUserById(id);
    }

    @PostMapping()
    public int insert(@RequestBody Department user){
        logger.info("Inserting new department: {}", user.toString());
        return deptService.InsertUser(user);
    }

    @PutMapping()
    public int update(@RequestBody Department user){
        logger.info("Updating department: {}", user.toString());
        return deptService.update(user);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id){
        logger.info("Deleting department with id: {}", id);
        return deptService.delete(id);
    }

    @PostMapping("/insertDept")
    public int insertUsers(@RequestBody List<Department> userList){
        logger.info("Inserting multiple departments: {}", userList.toString());
        return deptService.insertUsers(userList);
    }

    @DeleteMapping("/deleteDept")
    public int deleteUsers(@RequestBody List<Integer> idList){
        logger.info("Deleting multiple departments with ids: {}", idList.toString());
        return deptService.deleteUsers(idList);
    }

    @PutMapping("/updateBatch")
    public int updateBatch(@RequestBody List<Department> userList){
        logger.info("Updating multiple departments: {}", userList.toString());
        return deptService.updateBatch(userList);
    }



}
