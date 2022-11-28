package lekcijasSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

//Pārbaudīt kalkulatoru kas ir main/java lekcija seši. Pārbaudi veikt ar Assert.

public class majasDarbs {

    @Test
    private void testCalculatorAddition(){
        Calculator manskalkulators = new Calculator();
        int result = manskalkulators.add(6, 4);
        int expectedAdd=10;
        Assert.assertEquals(manskalkulators.add(6,4),expectedAdd);
    }

    @Test
    private void testCalculatorSubstract(){
        Calculator manskalkulators = new Calculator();
        int result = manskalkulators.substract(5, 2);
        int expectedSub=3;
        Assert.assertEquals(manskalkulators.substract(5,2),expectedSub);
    }
    @Test
    private void testCalculatorMultiply(){
        Calculator manskalkulators = new Calculator();
        int result = manskalkulators.multiply(5, 2);
        int expectedSMulti=10;
        Assert.assertEquals(manskalkulators.multiply(5,2),expectedSMulti);
    }

    @Test
    private void testCalculatorDivison(){
        Calculator manskalkulators = new Calculator();
        float result = manskalkulators.divide(15,5); //ar int nestrādāja tāpēc ir float
        int expectedDivide=3;
        Assert.assertEquals(manskalkulators.divide(15,5),expectedDivide);
    }
//    @Test - //Notestēju ka pareizi pārbauda
//    private void testCalculatorDivison(){
//        Calculator manskalkulators = new Calculator();
//        float result = manskalkulators.divide(15,5); //ar int nestrādāja tāpēc ir float
//        int expectedDivide=4;
//        Assert.assertEquals(manskalkulators.divide(15,5),expectedDivide);
//    }
}
