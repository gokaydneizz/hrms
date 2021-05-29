package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Employee;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	
}
