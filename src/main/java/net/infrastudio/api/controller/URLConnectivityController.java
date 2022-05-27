package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.infrastudio.api.model.URLConnectivityReport;
import net.infrastudio.api.repository.URLConnectivityRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class URLConnectivityController {
	
	@Autowired
	private URLConnectivityRepository urlRepository;
	
	
	//get test
	@GetMapping("URLReports")
	public List<URLConnectivityReport> getAllUrlReports(){
		return this.urlRepository.findAll();
	}
	
	//save test
	@PostMapping("save_urlReport")
	public URLConnectivityReport createTest(@RequestBody URLConnectivityReport url) {
		return this.urlRepository.save(url);
	}
	
}
