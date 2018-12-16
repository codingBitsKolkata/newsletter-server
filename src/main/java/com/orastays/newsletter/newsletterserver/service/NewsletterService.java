package com.orastays.newsletter.newsletterserver.service;

import com.orastays.newsletter.newsletterserver.exceptions.FormExceptions;
import com.orastays.newsletter.newsletterserver.model.SubscriberModel;

public interface NewsletterService {
	
	void addSubscriber(SubscriberModel subscriberModel) throws FormExceptions;
}