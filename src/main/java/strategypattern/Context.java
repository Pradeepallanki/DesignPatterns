package main.java.strategypattern;

public class Context {
    // context object will hold the strategy to be executed
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Integer executeStrategy(Integer num1, Integer num2) {
        return strategy.operate(num1, num2);
    }
}
