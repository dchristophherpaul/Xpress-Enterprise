package com.xpress.xapps.libs.dbconnect.repository;

import org.springframework.stereotype.Repository;

import com.xpress.xapps.libs.dbconnect.document.RunTimeConfig;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface RunTimeConfigRepository extends MongoRepository<RunTimeConfig, String>{

}
