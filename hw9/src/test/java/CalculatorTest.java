import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest extends Calculator{

        Calculator calculator = new Calculator();
        private static Logger log = Logger.getLogger(CalculatorTest.class);

        @Test
        public void add() {
            double addition = number1 + number2;
            log.info("Two numbers were entered");
            Assertions.assertEquals(calculator.addition(number1, number2), addition);
            log.debug("Addition complete successfully");
        }

        @Test
        public void sub() {
            double subtraction = number1 - number2;
            log.info("Two numbers were entered");
            Assertions.assertEquals(calculator.subtraction(number1, number2), subtraction);
            log.debug("Subtraction complete successfully");
        }

        @Test
        public void mul() {
            double multiplication = number1 * number2;
            log.info("Two numbers were entered");
            Assertions.assertEquals(calculator.multiplication(number1, number2), multiplication);
            log.debug("Multiplication complete successfully");
        }

        @Test
        public void addMin200_min200_Expect_min400() {
            double division = number1 / number2;
            log.info("Two numbers were entered");
            Assertions.assertEquals(calculator.division(number1, number2), division);
            log.debug("Division complete successfully");
        }
    }


