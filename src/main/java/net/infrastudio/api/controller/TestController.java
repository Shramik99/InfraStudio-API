package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.infrastudio.api.model.Test;
import net.infrastudio.api.repository.TestRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class TestController {
	
	@Autowired
	private TestRepository testRepository;
	
	
	//get test
	@GetMapping("test")
	public List<Test> getAllTest(){
		return this.testRepository.findAll();
	}
	
	//save test
	@PostMapping("save_test")
	public Test createTest(@RequestBody Test test) {
		return this.testRepository.save(test);
	}
	
	
	
}
