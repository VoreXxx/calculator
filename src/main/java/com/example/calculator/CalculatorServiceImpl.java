package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
