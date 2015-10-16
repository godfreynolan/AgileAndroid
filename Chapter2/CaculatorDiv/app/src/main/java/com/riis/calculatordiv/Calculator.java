package com.riis.calculatordiv;

public class Calculator {

    public enum Operator {ADD, SUB, DIV, MUL}


    public int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int sub(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

}
