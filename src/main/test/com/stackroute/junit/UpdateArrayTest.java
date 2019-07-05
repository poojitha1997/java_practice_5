package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.UpdateArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest
{
    UpdateArray updateArray;
    @Before
    public void setUp() throws Exception
    {
        updateArray = new UpdateArray();
    }

    @Test
    public void testForGivenStringReplaceWithAnotherString()
    {
        List<String> str = updateArray.updateSpecificElement("kiwi",0,"mango",2);
        assertEquals("[kiwi, grape, mango, berry]",str.toString());

    }
    @Test
    public void testForGivenStringReplaceWithAnotherStringFail()
    {
        List<String> str = updateArray.updateSpecificElement("kiwi",3,"mango",2);
        assertNotNull("[kiwi, grape, mango, berry]",str.toString());

    }

    @Test
    public void testForGivenStringIndexNotFound()
    {
        List<String> str = updateArray.updateSpecificElement("kiwi",7,"mango",2);
        assertEquals("[it is indexoutofboundsexception]",str.toString());

        // int str=occurrenceTest.countOccurrence("IT IS A CAT",'a');
      //  assertEquals(2,str);

    }

    @After
    public void tearDown() throws Exception
    {
     //  occurrenceTest = null;
    }




}