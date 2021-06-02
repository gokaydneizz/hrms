package kodlama.io.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.validators.EmployerValidator;
import kodlama.io.hrms.core.validators.abstracts.EmailCheckService;
import kodlama.io.hrms.core.validators.abstracts.FakeMernisCheckService;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	EmployerDao employerDao;
	EmailCheckService emailCheckService;
	private List<String> emails = new ArrayList<>();

	public EmployerManager(EmployerDao employerDao,EmailCheckService emailCheckService) {
		super();
		this.employerDao = employerDao;
		this.emailCheckService = emailCheckService;
		
	}

	@	Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Veri Basariyla Listelendi.");
	}

	@Override
	public Result register(Employer employer) {
		if(!EmployerValidator.ifEmpty(employer)) {
			return new ErrorResult("Kayit basarisiz.Tum alanlarin dolu oldugundan emin olunuz.");
		}else if(this.employerDao.findAllByEmail(employer.getEmail()).stream().count()!=0) {
			return new ErrorResult("Bu e mail adresi kullanimda.Baska bir e mail adresi kullaniniz.");
		}else if(!emailCheckService.emailCheck(employer.getEmail())) {
			return new ErrorResult("E mail'in dogru formda oldugundan emin olunuz.");
		}
		this.employerDao.save(employer);
		return new SuccessResult("Is veren hesabi basariyla eklendi,Dogrulama kodu gonderildi.");
		
		
	}



	



}
