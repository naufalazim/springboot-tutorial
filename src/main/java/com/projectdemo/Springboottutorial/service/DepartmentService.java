package com.projectdemo.Springboottutorial.service;

import com.projectdemo.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {


    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentList(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    //UPDATE METHOD:
    public Department updateDepartment(Long departmentId, Department department);

    //fetchbyName
    public Department fetchDepartmentByName(String departmentName);
}
