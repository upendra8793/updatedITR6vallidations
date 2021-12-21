package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="EI")
public class EI {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(max = 50)
	private String District;
	
	 @NotNull
	 @Pattern(regexp="[1-9]{1}[\\d]{5}")//Should be 6 digits and not start with 0
	 private String pinCode;
	 
	 @Pattern(regexp = "[1-9]{1,14}")
	 private String MeasurmntLand;
	 
	 @Pattern(regexp = "[1-9]{1,14}")
	 private String AmmountIncome;

}
