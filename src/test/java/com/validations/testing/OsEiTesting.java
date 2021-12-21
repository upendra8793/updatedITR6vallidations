package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.OSDao;
import com.validations.checking.entities.OS;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
class OsEiTesting {
	
	@Autowired
	private OSDao OSrepo;


	@Test
	void test() {
		
		OS o1=new OS();
		o1.setGrossIncome("122132434");
		o1.setItemNo("22");
		o1.setNature1E("4");
	    o1.setRateasITact("98");
	    o1.setRateAsTT("87");
	    o1.setSInumber("234");
	    
		this.OSrepo.save(o1);
		//boolean result = 
		OSrepo.existsById(o1.getId());
		assertThat(true).isTrue();
	}

}
