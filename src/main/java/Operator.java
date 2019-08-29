import java.util.function.BiFunction;

public enum Operator implements BiFunction<Integer, Integer, Integer> {

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

    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return null;
    }

    public BiFunction<Integer, Integer, Integer> getOperation() {
        return operation;
    }
}
