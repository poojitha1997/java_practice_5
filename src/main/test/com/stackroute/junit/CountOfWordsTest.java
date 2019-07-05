package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CountOfWords;
import main.java.com.stackroute.junit.UpdateArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CountOfWordsTest
{
CountOfWords countOfWords;
    @Before
    public void setUp() throws Exception
    {
        countOfWords = new CountOfWords();
    }

    @Test
    public void testForGivenStringCountTheOccurrence()
    {
        String str1 = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> str =new HashMap<String, Integer>();
        str= countOfWords.count(str1);
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",5);
        expectedResult.put("two",2);
        expectedResult.put("three",2);
         assertEquals(expectedResult,str);

    }
    @Test
    public void testForGivenStringCountTheOccurrenceFail()
    {
        String str1 = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> str =new HashMap<String, Integer>();
        str= countOfWords.count(str1);
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",5);
        expectedResult.put("two",2);
        expectedResult.put("three",2);
        assertNotNull(String.valueOf(str),str);



    }

    @Test
    public void testForGivenStringIsNull()
    {
        String str1 = "";
        Map<String,Integer> str =new HashMap<String, Integer>();
        str= countOfWords.count(str1);
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",5);
        expectedResult.put("two",2);
        expectedResult.put("three",2);
        assertEquals(null,str);

    }
    @After
    public void tearDown() throws Exception
    {
        countOfWords = null;
    }




}