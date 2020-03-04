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

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void sum(Long first, Long second, Long expectedResult) {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 20L;
        
        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert

        Assertions.assertEquals(expectedValue, result);


}


    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "2,    1,   2",
            "10,    5,   2",
            "20,  10, 2",
            "40,  20, 2"
    })
    @DisplayName("valido divicion")
    public void divideValidation(Long first, Long second, Long expectedResult)
{

    Long expectedValue =basicCalculator.div(first,second);

    Assertions.assertEquals(0,expectedResult);

}

    @ParameterizedTest(name = "{0} / {1}")
    @CsvSource({
            "0,    0, ",
            "4,    0, "

    })
    @DisplayName("valido divicion por cero")
    public void divideValidationByZero(Long first, Long second)
    {


        Assertions.assertThrows(IllegalAccessError.class,()->{
                            basicCalculator.div(first,second);
    });

}

    }

