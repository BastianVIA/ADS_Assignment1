import Calculator.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MalformedExpressionException {

        Client client = new Client();
        ArrayList<Token> tokenList = new ArrayList<>();
        int result;

        Token token5 = new Operand(5);
        Token token4 = new Operand(4);
        Token token8 = new Operand(8);
        Token token2 = new Operand(2);

        Token tokenAdd = new Operator(Operation.ADD);
        Token tokenSubtract = new Operator(Operation.SUBTRACT);
        Token tokenMultiply = new Operator(Operation.MULTIPLY);
        Token tokenDivide = new Operator(Operation.DIVIDE);

        tokenList.add(token5);
        tokenList.add(token4);
        tokenList.add(tokenAdd);
        tokenList.add(token2);
        tokenList.add(tokenMultiply);
        tokenList.add(token8);
        tokenList.add(tokenSubtract);
        tokenList.add(token5);
        tokenList.add(tokenDivide);
        // ((5 + 4) * 2 - 8) / 5 = 2

        result = client.evaluateExpression(tokenList);

        System.out.println("Result = " + result);
    }
}
