package com.phonedigits;

import com.phonedigits.phone.Conbination;
import com.phonedigits.phone.Keyboard;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * test number conversion letter combination (Have parameters)
     */
    @Test
    public void alphabeticListResult_1() {
        List<String> expectedResults = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        Conbination conbination = new Conbination(Keyboard.map);
        List<String> letterCombinationsList = conbination.letterCombinations("23");
        TestCase.assertEquals(expectedResults,letterCombinationsList);
    }

    /**
     * test number conversion letter combination (No parameters)
     */
    @Test
    public void alphabeticListResult_2() {
        List<String> expectedResults = new ArrayList<>();
        Conbination conbination = new Conbination(Keyboard.map);
        List<String> letterCombinationsList = conbination.letterCombinations(null);
        TestCase.assertEquals(expectedResults,letterCombinationsList);
    }
}
