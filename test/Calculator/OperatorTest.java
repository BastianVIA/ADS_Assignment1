package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void constructorCheck() {
        Operator operator = new Operator(Operation.ADD);
        assertEquals(Operation.ADD, operator.getOperation());
    }
}