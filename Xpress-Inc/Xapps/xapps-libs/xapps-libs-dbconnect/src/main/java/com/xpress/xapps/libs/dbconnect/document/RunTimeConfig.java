package com.xpress.xapps.libs.dbconnect.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class RunTimeConfig {
	
	@Id
	private String id;
	private Backend backend;

}
