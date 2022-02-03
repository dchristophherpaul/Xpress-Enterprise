package com.xpress.xapps.libs.common.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

@Data
public class XappRequest {

	private String correlationId;
	private String userId;
	private String password;
	private String service;

	public List<String> validateRequest() {
		List<String> validationErrorList = new ArrayList<>();
		if (StringUtils.isBlank(this.userId)) {
			validationErrorList.add("userID cannot be empty");
		}

		return validationErrorList;
	}

}
