package com.sparta.cucumber;

import java.util.List;

public class Calculator {

    private Integer num1;
    private Integer num2;

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num1 - num2;
    }


    public int divide(){
        if (num2 == 0) throw new ArithmeticException("Divisor cannot be zero.");
        return num1 / num2;
    }
}
