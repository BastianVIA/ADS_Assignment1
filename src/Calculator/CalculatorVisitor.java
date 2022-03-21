package Calculator;

import LinkedStack.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator {

    private LinkedStack<Token> tokenStack = new LinkedStack<Token>();

    @Override
    public int getResult() throws MalformedExpressionException {

        int result = 0;

        try {
            result = ((Operand) tokenStack.pop()).getValue();
        } catch (Exception e) {
            throw new MalformedExpressionException();
        }

        return result;
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }

    public void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    public void performOperation(Operator operator) throws MalformedExpressionException {

        try {
            Operand rightOperand = (Operand) tokenStack.pop();
            Operand leftOperand = (Operand) tokenStack.pop();

            Operation operation = operator.getOperation();

            int result = 0;
            switch (operation) {
                case ADD -> result = leftOperand.getValue() + rightOperand.getValue();
                case SUBTRACT -> result = leftOperand.getValue() - rightOperand.getValue();
                case MULTIPLY -> result = leftOperand.getValue() * rightOperand.getValue();
                case DIVIDE -> result = leftOperand.getValue() / rightOperand.getValue();
            }
            Operand resultOperand = new Operand(result);
            tokenStack.push(resultOperand);

        } catch (Exception e) {
            e.printStackTrace();
            throw new MalformedExpressionException();
        }

    }
}
