package com.example.hzqfirstproject.dto;

import com.example.hzqfirstproject.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class DeptInfo {

    private Integer id;

    private String deptName;

    private String description;

    private String address;

    private List<User> userList;
}
