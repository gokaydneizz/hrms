package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="languages")
@Entity
public class Language {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="language_name")
	private String languageName;
	
	@OneToMany(mappedBy = "language")
	@JsonIgnore
    private List<ForeignLanguage> foreignLanguage;
	
}
