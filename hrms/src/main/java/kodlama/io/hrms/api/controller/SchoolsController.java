package kodlama.io.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
	
	private SchoolService schoolService;
	
	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	
	
	@GetMapping("/getAll")
	public DataResult<List<School>> getAll(){
		return schoolService.getAll();
	}
	
	@GetMapping("/getAllBySorted")
	public DataResult<List<School>> getAllSortedByDate(){
		return this.schoolService.getAllSortedByDate();
	}
	
	@PostMapping("/add")
	public DataResult<School> add(@RequestBody School school){
		return this.schoolService.add(school);
	}
	
	
	
	

}
