/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.luistestes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author IFSul
 */
public class CalculadoraTest {
    
    private Calculadora c;
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        c = new Calculadora();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int somar = c.somar(10,20);
        System.out.println("Soma: " + somar);
        Assertions.assertEquals(30, somar);
        
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int subtrair = c.subtrair(20,10);
        System.out.println("Subtração: " + subtrair);
        Assertions.assertEquals(10 , subtrair);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int dividir = c.dividir(10,2);
        System.out.println("Divisão: " + dividir);
        Assertions.assertEquals(5 , dividir);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int multiplicar = c.multiplicar(5,10);
        System.out.println("Multiplicação: " + multiplicar);
        Assertions.assertEquals(50 , multiplicar);
    }

    /**
     * Test of verificarSeEPar method, of class Calculadora.
     */
    @Test
    
    public void testVerificarSeEPar() {
        System.out.println("Verificar se é par");
        boolean verificarSeEPar = c.verificarSeEPar(6);
        System.out.println("É par? " + verificarSeEPar);
        Assertions.assertEquals(true , verificarSeEPar);
    }
    
}
