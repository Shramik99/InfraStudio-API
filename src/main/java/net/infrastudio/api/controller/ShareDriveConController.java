package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.infrastudio.api.model.ShareDriveCReport;
import net.infrastudio.api.repository.ShareDriveCRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class ShareDriveConController {
	
	@Autowired
	private ShareDriveCRepository shareConRepository;
	
	
	//get test
	@GetMapping("ShareDriveCReport")
	public List<ShareDriveCReport> getAllLbtReports(){
		return this.shareConRepository.findAll();
	}
}
