package com.wzt.service;

import com.wzt.entity.Departments;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DeptService {

    List<Departments> getDeptList();
}
