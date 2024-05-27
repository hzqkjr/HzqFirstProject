package com.example.hzqfirstproject.dto;

import com.example.hzqfirstproject.entity.Department;
import lombok.Data;

import java.util.List;

@Data
public class UserInfo {

    private String userName;

    private Integer gender;

    private String birthday;

    private Integer deptId;

    private String deptName;

    private String description;

    private String address;
}
