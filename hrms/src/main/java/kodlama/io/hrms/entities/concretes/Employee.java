package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@PrimaryKeyJoinColumn(name="id")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;

	
	
	
}
