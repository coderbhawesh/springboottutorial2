package com.springboottutorial.springbootwebtutorial.controllers;

import com.springboottutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.springboottutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.springboottutorial.springbootwebtutorial.repositories.EmployeeRepository;
import com.springboottutorial.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){

        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping()
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age)
    {
        return employeeService.getAllEmployees();


    }

    @PostMapping()
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO emplo)
    {
        return employeeService.createNewEmployee(emplo);
    }

    @PutMapping("/{employeeId}")
    public EmployeeDTO updateEmployeeById(@RequestBody(required = false) EmployeeEntity emplo,@PathVariable Long employeeId)
    {



    }
}
