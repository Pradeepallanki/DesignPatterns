package main.java.strategypattern;

public class MultiplicationOperator implements IStrategy{
    @Override
    public Integer operate(Integer num1, Integer num2) {
        Integer result = num1*num2;
        System.out.println("Performing multiplication "+num1+" * "+num2+" = "+result);
        return result;
    }
}
