package com.orastays.newsletter.newsletterserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.orastays.newsletter.newsletterserver.helper.MessageUtil;
import com.orastays.newsletter.newsletterserver.service.NewsletterService;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected NewsletterService newsletterService;
	
	@Autowired
	protected MessageUtil messageUtil;
}
