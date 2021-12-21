package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="OS")
public class OS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Pattern(regexp = "[1-9]{1,14}")
	private String GrossIncome;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrossIncome() {
		return GrossIncome;
	}

	public void setGrossIncome(String grossIncome) {
		GrossIncome = grossIncome;
	}

	public String getNature1E() {
		return Nature1E;
	}

	public void setNature1E(String nature1e) {
		Nature1E = nature1e;
	}

	public String getItemNo() {
		return ItemNo;
	}

	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}

	public String getRateAsTT() {
		return RateAsTT;
	}

	public void setRateAsTT(String rateAsTT) {
		RateAsTT = rateAsTT;
	}

	public String getRateasITact() {
		return RateasITact;
	}

	public void setRateasITact(String rateasITact) {
		RateasITact = rateasITact;
	}

	public String getSInumber() {
		return SInumber;
	}

	public void setSInumber(String sInumber) {
		SInumber = sInumber;
	}

	@Pattern(regexp = "^.{1,50}$")
	private String Nature1E;
	
	@Pattern(regexp = "[\\d]{1,14}")
	private String ChargableIncome;
	
	@Pattern(regexp = "^[A-Z a-z 0-9]*$")
	private String ItemNo;
	
	@Pattern(regexp = "[0-9][1-9][0-9]|100")
	private String RateAsTT;
	
	@Pattern(regexp = "[0-9][1-9][0-9]|100")
	private String RateasITact;
	
	@Pattern(regexp = "[1-9]{1,14}")
	private String SInumber;

}
