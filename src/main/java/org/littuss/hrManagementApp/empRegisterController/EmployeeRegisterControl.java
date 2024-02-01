package org.littuss.hrManagementApp.empRegisterController;

import org.littuss.hrManagementApp.empRegisterModel.EmployeeDTO;
import org.littuss.hrManagementApp.empRegisterService.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeRegisterControl {
	 @Autowired
	 private EmployeeRegisterService registerService;
	 
	 @PostMapping("/register")
	    public String saveClassData(@RequestBody EmployeeDTO empDto) {
		 registerService.saveData(empDto);
	        return "Data saved successfully";
	    }


}

