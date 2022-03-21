import Calculator.CalculatorVisitor;
import Calculator.MalformedExpressionException;
import Calculator.Token;

import java.util.ArrayList;

public class Client {

    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    public int evaluateExpression(ArrayList<Token> tokenList) throws MalformedExpressionException {

        try {
            for (Token token : tokenList) {
                token.accept(calculatorVisitor);
            }

            return calculatorVisitor.getResult();

        } catch (Exception e) {
            throw new MalformedExpressionException();
        }
    }
}
