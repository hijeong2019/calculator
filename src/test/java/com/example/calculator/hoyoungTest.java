package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class hoyoungTest {
    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);

        assertEquals("함수의 결과는 9이여야 합니다",
                9, result);
        //왈왈왈
    }
}
