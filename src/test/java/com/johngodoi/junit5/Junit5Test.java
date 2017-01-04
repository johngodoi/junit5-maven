package com.johngodoi.junit5;

import org.junit.jupiter.api.Test;


/**
 * Created by jgodoi on 03/01/2017.
 */
public class Junit5Test {
    @Test
    void expectingArithmeticException(){
        org.junit.jupiter.api.Assertions.assertThrows(ArithmeticException.class,()-> divideByZero());
    }

    private int divideByZero() {
        return 3/0;
    }
}
