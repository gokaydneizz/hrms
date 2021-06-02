package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	DataResult<List<CurriculumVitae>> getAll();
	
	DataResult<CurriculumVitae> add(CurriculumVitae curriculumVitae);
}
