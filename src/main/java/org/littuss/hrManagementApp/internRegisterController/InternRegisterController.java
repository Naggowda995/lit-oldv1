package org.littuss.hrManagementApp.internRegisterController;

import org.littuss.hrManagementApp.internRegisterModel.InternDTO;
import org.littuss.hrManagementApp.internRegisterService.InternRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/intern")
public class InternRegisterController {

	@Autowired
	private InternRegisterService internRegisterService;
	
	@PostMapping("/register")
    public String saveClassData(@RequestBody InternDTO internDto) {
		internRegisterService.saveData(internDto);
        return "Data saved successfully";
    }
}
