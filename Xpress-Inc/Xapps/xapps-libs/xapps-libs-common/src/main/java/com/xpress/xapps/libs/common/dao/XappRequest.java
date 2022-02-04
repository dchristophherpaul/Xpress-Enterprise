package com.xpress.xapps.libs.common.dao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.xpress.xapps.libs.common.utilities.XpressGeneralConstants;

import lombok.Data;

@Data
public class XappRequest {

	private String correlationId;
	
	@NotBlank
	@Size(min = 0, max = 10, message = "userId should not exceed 10 character")
	private String userId;
	
	@Size(min = 8, max = 15, message = "Password must contain a length of at least 8 characters and a maximum of 15 characters")
	@Pattern(regexp = (XpressGeneralConstants.XAPPS_PASSWORD_PATTERN), message = "password should contain "
			+ "| one digit [0-9] "
			+ "| one lowercase Latin character [a-z]"
			+ "| one uppercase Latin character [A-Z]"
			+ "| one special character like ! @ # & ")
	private String password;
	
	@NotBlank
	private String service;

}
