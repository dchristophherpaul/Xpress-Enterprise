package com.xpress.xapps.libs.common.dao;

import java.util.UUID;

import lombok.Data;

@Data
public class XappResponse {
	
	private String correaltionId;
	private String statusCode;
	private String routeCarrier;
	private String correlationId;
	
	public XappResponse() {
		this.correlationId = UUID.randomUUID().toString();
	}

}
