package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobExperienceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlama.io.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{
	
	private JobExperienceDao jobExperienceDao;
	
	

	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> getAll() { 
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Tum data listelendi.");
	}

	@Override
	public DataResult<JobExperience> add(JobExperience jobExperience) {
		
		return new SuccessDataResult<>(this.jobExperienceDao.save(jobExperience));
	}

}
