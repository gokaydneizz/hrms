package kodlama.io.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.validators.CandidateValidator;
import kodlama.io.hrms.core.validators.abstracts.EmailCheckService;
import kodlama.io.hrms.core.validators.abstracts.FakeMernisCheckService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	private CandidateDao candidateDao;
	private EmailCheckService service;
	private FakeMernisCheckService mernisService;
	
	
	public CandidateManager(CandidateDao candidateDao,EmailCheckService service,FakeMernisCheckService mernisService) {
		super();
		this.candidateDao = candidateDao;
		this.service = service;
		this.mernisService = mernisService;
	}

		

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Basariyla Listelenmistir.");
	}
	

	@Override
	public Result register(Candidate candidate) {
		
		if(!CandidateValidator.ifEmpty(candidate)) {
			return new ErrorResult("Kayit basarisiz,tum alanlarin dolu oldugundan emin olun.");
		}else if(this.candidateDao.findAllByEmail(candidate.getEmail()).stream().count() !=0) {
			return new ErrorResult("Bu e mail adresi kullanimda.Baska bir e mail adresi kullaniniz.");
		}else if(this.candidateDao.findAllByNationalId(candidate.getNationalId()).stream().count() != 0) {
			return new ErrorResult("Ayni TC Kimlik numarasi ile yalnizca 1 kere kayit olabilirsiniz.");
		}else if(!service.emailCheck(candidate.getEmail())) {
			return new ErrorResult("E mail'in dogru formda oldugundan emin olunuz.");
		}else if(!mernisService.checkIfRealOne(candidate)) {
			return new ErrorResult("Tc kimlik numarasi 11'den fazla sayida karakter iceremez.");
		}

		this.candidateDao.save(candidate);
		return new SuccessResult("Is arayan hesabi basariyla eklendi");
				
		
	}






	





	
	
	


	


}
