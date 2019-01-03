package com.orastays.newsletter.newsletterserver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orastays.newsletter.newsletterserver.helper.DbConnection;

@Repository
public class BaseDAO {

	@Autowired
	protected DbConnection dbConnection;
}
