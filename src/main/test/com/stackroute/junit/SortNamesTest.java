package main.test.com.stackroute.junit;

import com.sun.source.tree.Tree;
import main.java.com.stackroute.junit.SortNames;
import main.java.com.stackroute.junit.UpdateArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortNamesTest
{
    SortNames sortNames;
    TreeSet<String> setNames = new TreeSet<>();



    @Before
    public void setUp() throws Exception
    {
        sortNames = new SortNames()
        ;
    }

    @Test
    public void testForGivenTreeSetPrintInAscendingOrder()
    {
        setNames.add("Harry");
        setNames.add("Olive");
        setNames.add("Alice");
        setNames.add("Bluto");
        setNames.add("Eugene");
       List<String> str = sortNames.sortTheNames(setNames);
       List expectedList = new ArrayList();
        expectedList.add("Alice");
        expectedList.add("Bluto");
        expectedList.add("Eugene");
        expectedList.add("Harry");
        expectedList.add("Olive");
       assertEquals(expectedList,str);
    }
    @Test
    public void testForGivenTreeSetPrintInAscendingOrderFail()
    {
        setNames.add("Harry");
        setNames.add("Olive");
        setNames.add("Alice");
        setNames.add("Bluto");
        setNames.add("Eugene");
        List<String> str = sortNames.sortTheNames(setNames);
        List expectedList = new ArrayList();
        expectedList.add("Alice");
        expectedList.add("Harry");
        expectedList.add("Eugene");
        expectedList.add("Bluto");
        expectedList.add("Olive");
        assertNotNull(String.valueOf(expectedList),str);
    }

    @Test
    public void testForGivenTreeSetIsEmpty()
    {
        List<String> str = sortNames.sortTheNames(setNames);
        List expectedList = null;

        assertEquals(expectedList,str);


    }

    @After
    public void tearDown() throws Exception
    {
          sortNames = null;
    }


}