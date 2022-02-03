package com.xpress.xapps.authentication.pojo;

import com.xpress.xapps.libs.common.dao.XappResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuthResponse extends XappResponse {

	private String redirectURL;

}
