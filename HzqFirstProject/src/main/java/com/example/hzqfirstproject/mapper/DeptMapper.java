package com.example.hzqfirstproject.mapper;

import com.example.hzqfirstproject.dto.DeptInfo;
import com.example.hzqfirstproject.dto.UserInfo;
import com.example.hzqfirstproject.entity.Department;
import com.example.hzqfirstproject.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeptMapper {

    List<DeptInfo> DeptInfo(Integer id);

    List<Department> selectAll();

    Department selectById(Integer id);

    int insertToUser(Department user);

    int update(Department user);

    int delete(Integer id);

    int insertDept(@Param("deptList") List<Department> deptList);

    int deleteDept(@Param("idList") List<Integer> idList);

    int updateBatch(@Param("deptList") List<Department> deptList);


}
