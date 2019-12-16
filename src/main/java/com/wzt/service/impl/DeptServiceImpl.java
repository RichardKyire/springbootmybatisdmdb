package com.wzt.service.impl;

import com.wzt.entity.Departments;
import com.wzt.mapper.DepartmentMapper;
import com.wzt.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Departments> getDeptList() {
        return departmentMapper.getDeptList();
    }
}
