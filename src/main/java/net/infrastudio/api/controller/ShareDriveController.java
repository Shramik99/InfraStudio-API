package net.infrastudio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.infrastudio.api.model.ShareDriveReport;
import net.infrastudio.api.repository.ShareDriveRepository;

@CrossOrigin(origins = "http://localhost:4200" )
@RestController
@RequestMapping("/api/")
public class ShareDriveController {
	
	@Autowired
	private ShareDriveRepository shareRepository;
	
	
	//get test
	@GetMapping("ShareDriveReport")
	public List<ShareDriveReport> getAllLbReports(){
		return this.shareRepository.findAll();
	}
	
	//get test by id
	@GetMapping("ShareDriveReport/uid/{uid}")
	public List<ShareDriveReport> getTestByUid(@PathVariable long uid){
		return this.shareRepository.getTestByUid(uid);
	}
}
