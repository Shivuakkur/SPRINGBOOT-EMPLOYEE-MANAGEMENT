package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService service;
    
    //1. Show register page
    @GetMapping("/register")
    public String showReg() {
        return "EmployeeRegister";
    }
    
    //2. Save form data
    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee, Model model) {
        Integer id = service.saveEmployee(employee);
        String message = "Employee " + id + " created successfully.";
        model.addAttribute("message", message);
        return "EmployeeRegister";
    }
    
    @GetMapping("/all")
    public String getAllEmployees(Model model) {
        List<Employee> list = service.getAllEmployees();
        list.forEach(emp -> System.out.println(emp));
        model.addAttribute("list", list);
        return "EmployeeList";
    }

    @GetMapping("/oneemp/{id}")
    public String getOneEmployee(@PathVariable Integer id, Model model) {
        Employee employee = service.getOneEmployee(id);
        System.out.println(employee);
        model.addAttribute("employee", employee);
        return "EmployeeData";
    }
    
    // Update employee
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee) {
        System.out.println("Inside update method");
        service.updateEmployee(employee);
        return "redirect:/employee/all";
    }
    
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Integer id, Model model) {
        Employee employee = service.getOneEmployee(id);
        if (employee != null) {
            model.addAttribute("emp", employee);
            return "EmployeeEdit";
        } else {
            return "redirect:/employee/all";
        }
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("Delete method called");
        service.deleteEmployee(id);
        return "redirect:/employee/all";
    }
}
