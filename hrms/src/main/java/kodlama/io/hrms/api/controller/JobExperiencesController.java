package kodlama.io.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobExperienceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperiences")
public class JobExperiencesController {
	private JobExperienceService jobExperienceService;
	
	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<JobExperience> add(@RequestBody JobExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
	}
}
