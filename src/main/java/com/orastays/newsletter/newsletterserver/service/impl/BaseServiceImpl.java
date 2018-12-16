package com.orastays.newsletter.newsletterserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.orastays.newsletter.newsletterserver.converter.SubscriberConverter;
import com.orastays.newsletter.newsletterserver.dao.SubscriberDao;
import com.orastays.newsletter.newsletterserver.validation.NewsletterValidation;

public abstract class BaseServiceImpl {

	@Value("${entitymanager.packagesToScan}")
	protected String entitymanagerPackagesToScan;
	
	@Autowired
	protected NewsletterValidation newsletterValidation;
	
	@Autowired
	protected SubscriberDao subscriberDao;
	
	@Autowired
	protected SubscriberConverter subscriberConverter;
}
