package com.neha.salarycalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class testSalaryCalculator {
    @Test
    public void testcalcTax(){
        SalaryCalculator sc = new SalaryCalculator();
        double tax= sc.calcTax(350000,0.085);
        assertEquals(tax,4250,0);
    }
}
