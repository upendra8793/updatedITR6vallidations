package com.validations.checking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validations.checking.dao.EIDao;
import com.validations.checking.dao.General1Dao;
import com.validations.checking.dao.General2Dao;
import com.validations.checking.dao.ITDao;
import com.validations.checking.dao.OSDao;
import com.validations.checking.dao.ValidationDao;
import com.validations.checking.entities.EI;
import com.validations.checking.entities.General1;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.IT;
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.OS;

@Service
public class ValidationServiceImpl implements ValidationService {
     	
	@Autowired
	private ValidationDao validationDao;
	
	@Autowired
	private ITDao itDao;
	
	@Autowired
	private General1Dao general1Dao;

	@Autowired
	private General2Dao general2Dao;
	
	@Autowired
	private EIDao eiDao;
	@Autowired
	private OSDao osDao;
	
	@Override
	public String test() {
		return "The configuration is done properly... this call is from service impl class";
	}

	@Override
	public List<ITR6Validation> getData() {
		return validationDao.findAll();
	}
	@Override
	public ITR6Validation addData(ITR6Validation data) {
		return validationDao.save(data);
	}

	@Override
	public List<IT> getitData() {
		return itDao.findAll();
	}
	@Override
	public IT additData(IT data) {
		return itDao.save(data);
	}

	@Override
	public List<General1> getGeneral1Data() {
		return general1Dao.findAll();
	}
	@Override
	public General1 addGeneral1Data(General1 data) {
		return general1Dao.save(data);
	}

	@Override
	public General2 addGeneral2Data(General2 data) {
		return general2Dao.save(data);
	}
	@Override
	public List<General2> getGeneral2Data() {
		return general2Dao.findAll();
	}

	@Override
	public EI addEIData(EI data) {
		// TODO Auto-generated method stub
		return eiDao.save(data);
	}

	@Override
	public List<EI> getEIData() {
		// TODO Auto-generated method stub
		return eiDao.findAll();
	}

	@Override
	public List<OS> getOSData() {
		// TODO Auto-generated method stub
		return this.osDao.findAll() ;
	}
	@Override
	public OS addOSData(OS data) {
		// TODO Auto-generated method stub
		return osDao.save(data);
	}
}
