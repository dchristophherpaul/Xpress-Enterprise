package com.xpress.xapps.authentication.pojo;

import com.xpress.xapps.libs.common.dao.XappRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuthRequest extends XappRequest {

	private String loginApp;
	
}
