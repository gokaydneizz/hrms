package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobDao;
import kodlama.io.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{
	
	private JobDao jobdao;
	
	@Autowired
	public JobManager(JobDao jobdao) {
		this.jobdao = jobdao;
	}


	@Override
	public DataResult<List<Job>> getAll(){
		return new SuccessDataResult<List<Job>>(this.jobdao.findAll(),"Is pozisyonlari Listelendi!");
	}


	@Override
	public DataResult<List<Job>> add(Job job) {
		if(this.jobdao.findAllByTitle(job.getTitle()).stream().count()!=0) {
			return new ErrorDataResult<Job>("Bu is zaten sistemde mevcut.");
		}
		return new SuccessDataResult<Job>(this.jobdao.save(job),"Is basariyla sisteme eklendi.");
	}


	

	
	
	

}
