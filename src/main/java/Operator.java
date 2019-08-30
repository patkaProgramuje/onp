import java.util.function.BiFunction;

public enum Operator{

    ADD("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTI("*", (a, b) -> a * b),
    DIV("/", (a, b) -> a / b);

    private String operationSymbol;
    private BiFunction<Integer, Integer, Integer> operation;

    public String getOperationSymbol() {
        return operationSymbol;
    }

    Operator(String operationSymbol, BiFunction<Integer, Integer, Integer> operation) {
        this.operationSymbol = operationSymbol;
        this.operation = operation;
    }

    public BiFunction<Integer, Integer, Integer> getOperation() {
        return operation;
    }
}
