package com.xpress.xapps.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.xpress.xapps.authentication.pojo.AuthRequest;
import com.xpress.xapps.authentication.pojo.AuthResponse;

@Service
public abstract class AuthenticationService {

	 @Autowired
	 private ApplicationContext appContext;
	
	public AuthResponse executeService(AuthRequest authRequest) {
		AuthenticationService authService = appContext.getBean(authRequest.getService(), AuthenticationService.class);
		return authService.executeImplementaion(authRequest);
	}

	public abstract AuthResponse executeImplementaion(AuthRequest authRequest) ;

}
