package com.ejemplo.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        System.out.println("La suma es "+ calc.sumar(2, 3));
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(5, 4));
        System.out.println("La resta es "+ calc.restar(2, 3));
    }
}

