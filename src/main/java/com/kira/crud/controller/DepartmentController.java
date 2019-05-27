package com.kira.crud.controller;

import com.kira.crud.bean.Department;
import com.kira.crud.bean.Msg;
import com.kira.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @ResponseBody
    @RequestMapping("/depts")
    public Msg getDepts(){
        List<Department> list= departmentService.getDepts();
        return Msg.success().add("dept",list);
    }
}
