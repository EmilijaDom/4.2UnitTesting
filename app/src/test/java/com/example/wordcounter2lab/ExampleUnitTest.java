package com.example.wordcounter2lab;

import com.example.wordcounter2lab.Util.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test(expected = NullPointerException.class)
    public void nullIsGivenTo_getWordsCount(){
        ElementsCalculator.getWordsCount(null);
    }


    @Test
    public void getCharsCount__fieldempty() {

        final int ResultExpectation = 0;
        final int actualResult = ElementsCalculator.getCharsCount("");
        assertEquals(ResultExpectation, actualResult);
    }

    @Test
    public void getWordsCount__fieldempty() {

        final int ResultExpectation = 0;
        final int actualResult = ElementsCalculator.getWordsCount("");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getCharsCount_fieldonlyspaces(){

        final int ResultExpectation = 3;
        final int actualResult = ElementsCalculator.getCharsCount("   ");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getWordsCount_fieldonlyspaces(){

        final int ResultExpectation = 0;
        final int actualResult = ElementsCalculator.getWordsCount("   ");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getCharsCount_fieldnormal(){

        final int ResultExpectation = 3;
        final int actualResult = ElementsCalculator.getCharsCount("Hey");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getWordsCount_fieldnormal(){

        final int ResultExpectation = 1;
        final int actualResult = ElementsCalculator.getWordsCount("Hey");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getCharsCount_fieldonlysymbols() {

        final int ResultExpectation = 5;
        final int actualResult = ElementsCalculator.getCharsCount(".....");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getWordsCount_fieldonlysymbols() {

        final int ResultExpectation = 1;
        final int actualResult = ElementsCalculator.getWordsCount(".....");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getCharsCount_fieldonlynumbers() {

        final int ResultExpectation = 3;
        final int actualResult = ElementsCalculator.getCharsCount("999");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getWordsCount_fieldonlynumbers() {

        final int ResultExpectation = 1;
        final int actualResult = ElementsCalculator.getWordsCount("999");
        assertEquals(ResultExpectation, actualResult);
    }
    @Test
    public void getCharsCount_fieldwithnumbers() {
        final int ResultExpectation = 7;
        final int actualResult = ElementsCalculator.getCharsCount("hey 999");
        assertEquals(ResultExpectation, actualResult);

    }
    @Test
    public void getWordsCount_fieldwitsymbols() {
        final int ResultExpectation = 1;
        final int actualResult = ElementsCalculator.getWordsCount("hey.....");
        assertEquals(ResultExpectation, actualResult);

    }