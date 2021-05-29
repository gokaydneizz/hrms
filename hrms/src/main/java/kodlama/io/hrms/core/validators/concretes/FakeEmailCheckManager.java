package kodlama.io.hrms.core.validators.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlama.io.hrms.core.validators.abstracts.FakeEmailCheckService;

@Primary
@Component
public class FakeEmailCheckManager implements FakeEmailCheckService{

	@Override
	public boolean emailCheck(String email) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
