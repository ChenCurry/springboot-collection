package com.hello.sb06mybatis.controller;

import com.hello.sb06mybatis.mapper.DepartmentMapper;
import com.hello.sb06mybatis.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper mapper;

    @GetMapping("/getDepartment/{id}")
    public String getDepartment(@PathVariable("id") int id) {
        Department department = mapper.getDepartment(id);
        String str = "";
        if (null != department) {
            System.out.println(department.toString());
            str = department.toString();
        }else{
            str = "没查到";
        }
        return str;
    }

    @GetMapping("/getDepartments")
    public List<Department> getDepartments() {
        List<Department> departments = mapper.getDepartments();
        for (Department department : departments) {
            System.out.println(department);
        }
        return departments;
    }
}
