package com.qlsv_department_service.service;

import com.qlsv_department_service.entity.Department;
import com.qlsv_department_service.repository.DepartmentRepository;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
//@RequiredArgsConstructor
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department derpartment) {
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(derpartment);
    }

    public Department findDeparmentById(Long departmentId) {
        log.info("inside findDeparmentById ");
        return departmentRepository.findById(departmentId).get();
    }

    public List<Department> findAllDepartment(){
        return departmentRepository.findAll();
    }
}
