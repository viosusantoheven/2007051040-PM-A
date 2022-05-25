package com.example.myunittesting1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator() ;

    @Test
    public void add() {

        float result = calculator.add(9,1);

    }
    public void add1() {

        float result1 = calculator.add(13,8);
    }
}