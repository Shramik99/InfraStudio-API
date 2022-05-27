package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.infrastudio.api.model.LoadBalancingReport;
import net.infrastudio.api.repository.LoadBalancingRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class LoadBalancingController {
	
	@Autowired
	private LoadBalancingRepository lbRepository;
	
	
	//get test
	@GetMapping("LoadBalancingReport")
	public List<LoadBalancingReport> getAllLbReports(){
		return this.lbRepository.findAll();
	}
	
	//get test by id
	@GetMapping("LoadBalancingReport/uid/{uid}")
	public List<LoadBalancingReport> getTestByUid(@PathVariable long uid){
		return this.lbRepository.getTestByUid(uid);
	}

}
