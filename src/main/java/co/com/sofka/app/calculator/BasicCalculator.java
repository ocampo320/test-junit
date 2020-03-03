package co.com.sofka.app.calculator;



import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import co.com.sofka.app.App;



public class BasicCalculator {
	private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
	public Long sum(Long number1, Long number2) {
	  // logger.info("Summing {} + {}", number1, number2 +"");
	    return number1 + number2;
	}
}
