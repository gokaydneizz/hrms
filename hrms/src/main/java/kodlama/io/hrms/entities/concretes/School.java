package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="schools")
@Entity
public class School {
	@Id
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private CurriculumVitae curriculumVitae;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="graduate_date")
	private LocalDate graduateDate;
	
}
