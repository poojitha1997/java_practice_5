package main.java.com.stackroute.junit;

import java.util.HashMap;
import java.util.Map;

//program to check whether the key is repeated more than two times in the map
public class StringOccurrence
{
    Map<String,Boolean> finalString = new HashMap<String, Boolean>();

    public Map<String, Boolean> appearanceCheck(String[] givenArray)
    {
        if(givenArray.length==0) //return null if given array is null
            return null;
        for(int i=0;i<givenArray.length;i++)
        {
            if(finalString.containsKey(givenArray[i])) //checking if the array has the element
            {
                finalString.put(givenArray[i],true);
            }
            else
                finalString.put(givenArray[i],false);
        }


        return finalString;
    }
}
