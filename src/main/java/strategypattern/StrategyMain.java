package main.java.strategypattern;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new AdditionOperator());
        context.executeStrategy(5,5);

        context = new Context(new SubstractionOperator());
        context.executeStrategy(5,5);

        context = new Context(new MultiplicationOperator());
        context.executeStrategy(5,5);

        context = new Context(new DivisionOperator());
        context.executeStrategy(5,5);
    }
}
