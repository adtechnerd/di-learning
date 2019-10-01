package org.futuristic.dilearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingImpl implements IGreeting {
	
	private GreetingRepository repository;
	
    public PrimaryGreetingImpl(GreetingRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
    public String greeting() {
    	return repository.getEnglishGreeting();
    }
}
