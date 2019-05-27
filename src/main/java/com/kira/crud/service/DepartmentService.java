package com.kira.crud.service;

import com.kira.crud.bean.Department;
import com.kira.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    public List<Department> getDepts(){
        return departmentMapper.selectByExample(null);
    }
}
