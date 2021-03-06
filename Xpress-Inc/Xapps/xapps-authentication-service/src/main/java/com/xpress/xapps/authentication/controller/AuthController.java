package com.xpress.xapps.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpress.xapps.authentication.pojo.AuthRequest;
import com.xpress.xapps.authentication.pojo.AuthResponse;
import com.xpress.xapps.authentication.service.AuthenticationService;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

	@Autowired
	AuthenticationService authService;

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AuthResponse authorizeUSer(@RequestBody AuthRequest authRequest) {
		return authService.executeService(authRequest);
	}

}
