package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;

	@Service
	public class JobAdvertisementManager  implements JobAdvertisementService{

		JobAdvertisementDao jobAdvertisementDao;
		
		@Autowired
		public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
			super();
			this.jobAdvertisementDao = jobAdvertisementDao;
		}
		
		
		@Override
		public DataResult<List<JobAdvertisement>> getAll() {
			return new SuccessDataResult<List<JobAdvertisement>>
			(this.jobAdvertisementDao.findAll(),"Basariyla listelendi.");
			
		}
		
		
		@Override
		public DataResult<List<JobAdvertisement>> getAllActiveSorted() {
			return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActiveSorted(),"Data tarihe gore listelendi.");
		}


		

		@Override
		public DataResult<List<JobAdvertisement>> getAllByActive() {
			return new SuccessDataResult<List<JobAdvertisement>>
			(this.jobAdvertisementDao.getAllByActive(),"Aktif olan is ilanlari listelendi");
		}


		@Override
		public Result add(JobAdvertisement jobAdvertisement) {
			this.jobAdvertisementDao.save(jobAdvertisement);
			return new SuccessResult("Is ilani listeye eklendi.");
		}


		
		
		
		
		

		
		
		
		
	
	}
