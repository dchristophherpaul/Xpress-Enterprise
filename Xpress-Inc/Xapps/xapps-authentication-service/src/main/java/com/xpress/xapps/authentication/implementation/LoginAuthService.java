package com.xpress.xapps.authentication.implementation;

import org.springframework.stereotype.Component;

import com.xpress.xapps.authentication.pojo.AuthRequest;
import com.xpress.xapps.authentication.pojo.AuthResponse;
import com.xpress.xapps.authentication.service.AuthenticationService;
import com.xpress.xapps.authentication.utilities.AuthenticationConstant;

@Component(AuthenticationConstant.LOGIN_SERVICE)
public class LoginAuthService extends AuthenticationService {

	@Override
	public AuthResponse executeImplementaion(AuthRequest authRequest) {
		AuthResponse authResponse = new AuthResponse();
		return authResponse;
	}

}
