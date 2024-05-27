package com.example.hzqfirstproject.service;

import com.example.hzqfirstproject.dto.DeptInfo;
import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.Department;
import com.example.hzqfirstproject.entity.User;
import com.example.hzqfirstproject.mapper.DeptMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;


    public List<DeptInfo> getDeptInfo(Integer id){
        return deptMapper.DeptInfo(id);
    }

    public List<Department> getUsers(){
        return deptMapper.selectAll();
    }

    public Department getUserById(Integer id){
        return deptMapper.selectById(id);
    }

    public Integer InsertUser(Department user){
        return deptMapper.insertToUser(user);
    }

    public int update(Department user){
        return deptMapper.update(user);
    }

    public int delete(Integer id){
        return deptMapper.delete(id);
    }

    public int insertUsers(List<Department> deptList){return deptMapper.insertDept(deptList);}

    public int deleteUsers(List<Integer> idList){
        return deptMapper.deleteDept(idList);
    }

    public int updateBatch(List<Department> deptList){
        return deptMapper.updateBatch(deptList);
    }




}
