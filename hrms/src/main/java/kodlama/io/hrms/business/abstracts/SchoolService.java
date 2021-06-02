package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.School;

public interface SchoolService {
	DataResult<List<School>> getAll();
	DataResult<List<School>> getAllSortedByDate();
	DataResult<School> add(School school);
}
