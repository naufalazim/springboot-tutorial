package com.projectdemo.Springboottutorial.service;

import com.projectdemo.Springboottutorial.entity.Department;
import com.projectdemo.Springboottutorial.repository.DeparmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeparmentServiceImpl implements DepartmentService{

    //connect dengan repository
    @Autowired
    private DeparmentRepository departmentRepository;

    //Add
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    //Display all list
    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    //Display by id
    @Override
    public Department fetchDepartmentList(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    //Delete by id:
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }


    //Update by id:
    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        //create new object depDB:
        Department depDB = departmentRepository.findById(departmentId).get();

        //logic update code:

        //update department name:
        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {

            depDB.setDepartmentName(department.getDepartmentName());
        }

        //update department code:
        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {

            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        //update department address:
        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {

            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(depDB);
    }

    //fetch by Name:
    //NOTE: KENA BUAT IgnoreCase!
    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }


}
