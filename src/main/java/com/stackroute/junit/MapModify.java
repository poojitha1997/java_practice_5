package main.java.com.stackroute.junit;

import java.util.Map;
//program to modify the values in the map
public class MapModify {
    public Map<String,String> modifyMap(Map<String,String> givenMap)
    {
        givenMap.put("val2", "java"); //changing the value of val2 to java

        givenMap.put("val1"," "); //removing the value of the val1 to blank space


        return givenMap;
    }

}
