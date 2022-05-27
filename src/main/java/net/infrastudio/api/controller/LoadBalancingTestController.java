package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.infrastudio.api.model.LoadBalancingTest;
import net.infrastudio.api.repository.LaodBalancingTestRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class LoadBalancingTestController {
	
	@Autowired
	private LaodBalancingTestRepository lbtRepository;
	
	
	//get test
	@GetMapping("LoadBalancingTest")
	public List<LoadBalancingTest> getAllLbtReports(){
		return this.lbtRepository.findAll();
	}
	
//	//get report by uid
//	@GetMapping("LoadBalancingTest/{uid}")
	

}
