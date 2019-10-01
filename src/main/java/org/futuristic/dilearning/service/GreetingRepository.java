/**
 * 
 */
package org.futuristic.dilearning.service;

/**
 * @author Aditya Ajmera
 *
 */
public interface GreetingRepository {
	
	/**
	 * Greeting in english
	 * @return
	 */
	String getEnglishGreeting();

	/**
	 * Greeting in spanish
	 * @return
	 */
    String getSpanishGreeting();

    /**
	 * Greeting in german
	 * @return
	 */
    String getGermanGreeting();
    
    /**
	 * Greeting in gujrati
	 * @return
	 */
    String getGujratiGreeting();
}
