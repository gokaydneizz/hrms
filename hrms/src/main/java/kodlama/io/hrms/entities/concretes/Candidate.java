package kodlama.io.hrms.entities.concretes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@PrimaryKeyJoinColumn(name="id")
@Entity
@Table(name= "candidates")
@Inheritance(strategy =InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends User{	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth")	
	private LocalDateTime dateOfBirth;
	
	@Column(name="national_id")	
	private String nationalId;
	
	@OneToMany(mappedBy="candidate")
	@JsonIgnore
	private List<CurriculumVitae> curriculumVitae;
	
	
	
}