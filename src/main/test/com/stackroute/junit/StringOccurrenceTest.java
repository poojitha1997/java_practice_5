package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.StringOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringOccurrenceTest
{

    StringOccurrence stringOccurrence;

    @Before
    public void setUp() throws Exception
    {
        stringOccurrence = new StringOccurrence();
    }

    @Test
    public void testForGivenStringCheckTheOccurrence()
    {
        String arr[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> str =new HashMap<String, Boolean>();
        Map<String,Boolean> expectedResult =new HashMap<String, Boolean>();
        expectedResult.put("a",true);
        expectedResult.put("b",false);
        expectedResult.put("c",true);
        expectedResult.put("d",false);
        str= stringOccurrence.appearanceCheck(arr);
        assertEquals(expectedResult,str);

    }
    @Test
    public void testForGivenStringCheckTheOccurrenceFail()
   {
       String arr[] = {"a","b","c","d","a","c","c"};
       Map<String,Boolean> str =new HashMap<String, Boolean>();
       Map<String,Boolean> expectedResult =new HashMap<String, Boolean>();
       expectedResult.put("a",true);
       expectedResult.put("b",false);
       expectedResult.put("c",true);
       expectedResult.put("a",false);
       str= stringOccurrence.appearanceCheck(arr);
       assertNotNull(String.valueOf(expectedResult),str);
    }

    @Test
    public void testForGivenStringIsNull()
    {
        String arr[] = {};
        Map<String,Boolean> str =new HashMap<String, Boolean>();
        Map<String,Boolean> expectedResult =null;
        str = stringOccurrence.appearanceCheck(arr);
        assertEquals(expectedResult,str);
    }
    @After
    public void tearDown() throws Exception
    {
        stringOccurrence = null;
    }

}