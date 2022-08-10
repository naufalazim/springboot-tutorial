package com.projectdemo.Springboottutorial.repository;

import com.projectdemo.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeparmentRepository extends JpaRepository<Department, Long> {

    //findByEntities
    public Department findByDepartmentName(String departmentName);

    @Query("")
    public Department findByDepartmentNameIgnoreCase(String departmentName); //Ignore Case!

}
