package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CurriculumVitaeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kodlama.io.hrms.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{
	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(),"Tum data listelendi.");
	}

	@Override
	public DataResult<CurriculumVitae> add(CurriculumVitae curriculumVitae) {		
		return new SuccessDataResult<>(this.curriculumVitaeDao.save(curriculumVitae));
	}

}
