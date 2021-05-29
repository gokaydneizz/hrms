package kodlama.io.hrms.entities.concretes;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
	private LocalDate dateOfBirth;
	@Column(name="national_id")
	private String nationalId;
}
