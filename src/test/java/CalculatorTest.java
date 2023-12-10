import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;


@DisplayName("Test Math operations in Calculator class")
public class CalculatorTest {
    Calculator calculator;







    @BeforeAll
    static void setUp(){
        System.out.println("Executing @BeforeAll method.");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Executing @AfterAll method.");
    }

    @BeforeEach
    public void beforeEachTestMethod(){
        calculator = new Calculator();
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void afterEachTestMethod(){
        System.out.println("After Each");
    }


    @DisplayName("Division by Zero")
    @Test
    public void testIntegerDivision_WhenDivisorIsValidInteger_ShouldReturnTwo(){

        System.out.println("Divisor is valid!");
        int result =  calculator.integerDivision(10,5);
       Assertions.assertEquals(2,result,"You should get expected and actual equal!!!");

    }

    @DisplayName("Test 33-1=32")
    @Test
    public void testSubMethod(){
        System.out.println("Sub");
        int result = calculator.integerSubtraction(10,5);
        Assertions.assertEquals(result,5);

    }
    @Test
    public void testSubMethodNotEquals(){
        int result = calculator.integerSubtraction(10,5);
       Assertions.assertNotEquals(result,11);

    }
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){
        System.out.println("Running Division by Zero");
        //Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";




        //Act && Assert
        ArithmeticException exception= Assertions.assertThrows(ArithmeticException.class,()->{
            calculator.integerDivision(dividend,divisor);
        },"Division by zero should have thrown an Arithmetic exception.");





        //Assert
        Assertions.assertEquals(expectedExceptionMessage,exception.getMessage());






    }
    @ParameterizedTest
    @ValueSource(strings = {"John","Kate","Alex"})
    void valueSourceDemonstration(String firstName){
        System.out.println(firstName);
        Assertions.assertNotNull(firstName);
    }







    @DisplayName("Test integer subtraction!!!")
    @ParameterizedTest
//    @MethodSource("integerSubtractionInputParameters")
//    @CsvSource({"33,1,32",
//                 "4,1,3"
//    })

    @CsvFileSource(resources = "/integerDivision.csv")
    void integerSubtraction(int minuend,int subtrahend,int expectedResult){

        int actualResult  =calculator.integerSubtraction(minuend,subtrahend);

        Assertions.assertEquals(expectedResult,actualResult);
    }
//    private static Stream<Arguments> integerSubtractionInputParameters(){
//        return Stream.of(
//                Arguments.of(33,1,32),
//                Arguments.of(4,1,3)
//        );
//    }

}
