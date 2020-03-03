package co.com.sofka.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.com.sofka.app.calculator.BasicCalculator;

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
}
