package main.java.strategypattern;


public class AdditionOperator implements IStrategy{
    @Override
    public Integer operate(Integer num1, Integer num2) {
        Integer result = num1+num2;
        System.out.println("Performing addition "+num1+" + "+num2+" = "+result);
        return result;
    }
}
