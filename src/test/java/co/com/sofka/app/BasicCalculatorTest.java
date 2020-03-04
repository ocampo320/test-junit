package co.com.sofka.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.com.sofka.app.calculator.BasicCalculator;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }


    @Test
    @DisplayName("Testing sum: 1-1=0")
    public void resta() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing sum: 5x5=25")
    public void multiplica() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 5L;
        Long expectedValue = 25L;

        // Act
        Long result = basicCalculator.multiplica(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing sum: 25/5=5")
    public void div() {
        // Arrange
        Long number1 = 25L;
        Long number2 = 5L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }



    }

