package Calculator;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class OperandTest {

    @Test
    void constructorCheck() {
        int testValue = 10;
        Operand operand = new Operand(testValue);

        assertEquals(testValue, operand.getValue());
    }

}