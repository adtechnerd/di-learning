/**
 * 
 */
package org.futuristic.dilearning.service;

import org.springframework.stereotype.Component;

/**
 * @author Aditya Ajmera
 *
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	/* (non-Javadoc)
	 * @see org.futuristic.dilearning.service.GreetingRepository#getEnglishGreeting()
	 */
	@Override
	public String getEnglishGreeting() {
		return "Hello I am GOD";
	}

	/* (non-Javadoc)
	 * @see org.futuristic.dilearning.service.GreetingRepository#getSpanishGreeting()
	 */
	@Override
	public String getSpanishGreeting() {
		return "Hola soy DIOS";
	}

	/* (non-Javadoc)
	 * @see org.futuristic.dilearning.service.GreetingRepository#getGermanGreeting()
	 */
	@Override
	public String getGermanGreeting() {
		return "Hallo ich bin gott";
	}

	@Override
	public String getGujratiGreeting() {
		return " નમસ્તે હું ભગવાન છું ";
	}
}
