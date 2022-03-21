import Calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;
    ArrayList<Token> tokenList;
    Token token1 = new Operand(5);
    Token token2 = new Operand(3);

    @BeforeEach
    void setup() {
        client = new Client();
        tokenList = new ArrayList<>();
    }

    @Test
    void testResult() throws MalformedExpressionException {
        Token tokenSubtract = new Operator(Operation.SUBTRACT);

        tokenList.add(token1);
        tokenList.add(token2);
        tokenList.add(tokenSubtract);

        assertEquals(5 - 3, client.evaluateExpression(tokenList));
    }

    @Test
    void testExceptionWithIncompleteTokenListThrowException() {
        Token tokenAdd = new Operator(Operation.ADD);

        tokenList.add(token1);
        tokenList.add(tokenAdd);

        assertThrows(MalformedExpressionException.class, () -> client.evaluateExpression(tokenList));
    }

    @Test
    void postfixCheck() throws MalformedExpressionException {
        Token tokenSubtract = new Operator(Operation.SUBTRACT);
        Token tokenAdd = new Operator(Operation.ADD);
        Token tokenMultiply = new Operator(Operation.MULTIPLY);

        tokenList.add(token1);
        tokenList.add(token2);
        tokenList.add(tokenSubtract);
        tokenList.add(token2);
        tokenList.add(token2);
        tokenList.add(tokenAdd);
        tokenList.add(tokenMultiply);
        // (5 - 3) * (3 + 3) = 12

        assertEquals((5 - 3) * (3 + 3), client.evaluateExpression(tokenList));

    }

}