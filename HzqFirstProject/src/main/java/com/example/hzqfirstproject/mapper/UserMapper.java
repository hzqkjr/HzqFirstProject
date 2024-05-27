package com.example.hzqfirstproject.mapper;

import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectById(Integer id);

    int insertToUser(User user);

    int update(User user);

    int delete(Integer id);

    List<UserInfo> getUserInfo();

    int insertUsers(@Param("userList") List<User> userList);

    int deleteUsers(@Param("idList") List<Integer> idList);

    int updateBatch(@Param("userList") List<User> userList);

}
