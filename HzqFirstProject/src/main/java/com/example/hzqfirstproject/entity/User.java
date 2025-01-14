package com.example.hzqfirstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String userName;

    private String password;

    private Integer gender;

    private String birthday;

    private Integer deptId;

}
