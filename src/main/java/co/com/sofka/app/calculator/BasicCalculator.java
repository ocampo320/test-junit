package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;

public class BasicCalculator {
	private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
	public Long sum(Long number1, Long number2) {
	  logger.info("Summing {} + {}", number1, number2 +"");
	    return number1 + number2;
	}

	public Long resta(Long number1,Long number2)
	{
		logger.info("restando {} - {}", number1, number2 +"");
		return number1 - number2;

	}
	public Long multiplica(Long number1,Long number2)
	{
		logger.info("restando {} x {}", number1, number2 +"");
		return number1 * number2;

	}
	public Long divide(Long number1,Long number2)
	{
		logger.info("divide {} / {}", number1, number2 +"");
		return number1 / number2;

	}



}
