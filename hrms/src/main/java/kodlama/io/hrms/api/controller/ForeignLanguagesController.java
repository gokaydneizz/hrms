package kodlama.io.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.ForeignLanguageService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignLanguages")
public class ForeignLanguagesController {
	
	private ForeignLanguageService foreignLanguageService;
	
	
	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ForeignLanguage>> getAll(){
		return this.foreignLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<ForeignLanguage> add(@RequestBody ForeignLanguage foreignLanguage){
		return this.foreignLanguageService.add(foreignLanguage);
	}
	
	
}
