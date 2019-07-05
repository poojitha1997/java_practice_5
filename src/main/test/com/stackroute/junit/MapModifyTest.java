package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.MapModify;
import main.java.com.stackroute.junit.StringOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModifyTest
{
    MapModify mapModify;
    Map<String,String> map1 = new HashMap<>();
    Map<String,String> map2 = new HashMap<>();

    @Before
    public void setUp() throws Exception
    {
        mapModify = new MapModify();
    }

    @Test
    public void testForGivenStringReplaceTheValues()
    {
        map1.put("val1","java");
        map1.put("val2","c++");
        map2.put("val1","mars");
        map2.put("val2","saturn");
        Map<String,String> expectedResultOfMap1 = new HashMap<>();
        expectedResultOfMap1.put("val1"," ");
        expectedResultOfMap1.put("val2","java");
        Map<String, String> str = new HashMap<>();
        str=mapModify.modifyMap(map1);
        assertEquals(expectedResultOfMap1,str);
    }
    @Test
    public void testForGivenStringReplaceTheValuesFail()
    {
        map1.put("val1","java");
        map1.put("val2","c++");
        map2.put("val1","mars");
        map2.put("val2","saturn");
        Map<String,String> expectedResultOfMap1 = new HashMap<>();
        expectedResultOfMap1.put("val1"," ");
        expectedResultOfMap1.put("val2","c++");
        Map<String, String> str = new HashMap<>();
        str=mapModify.modifyMap(map1);
        assertNotNull(String.valueOf(expectedResultOfMap1),str);

    }

    @After
    public void tearDown() throws Exception
    {
        mapModify = null;
    }


}