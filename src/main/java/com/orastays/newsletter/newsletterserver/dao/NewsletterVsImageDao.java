package com.orastays.newsletter.newsletterserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.newsletter.newsletterserver.entity.NewsletterVsImageEntity;

@Repository
public class NewsletterVsImageDao extends GenericDAO<NewsletterVsImageEntity, Long> {

	private static final long serialVersionUID = -488399347066140263L;

	public NewsletterVsImageDao() {
		super(NewsletterVsImageEntity.class);

	}
}
