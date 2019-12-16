package com.wzt.mapper;

import com.wzt.entity.Departments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {


    @Select("select * from departments")
    List<Departments> getDeptList();
}
