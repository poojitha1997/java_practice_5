package main.java.com.stackroute.junit;

import main.test.com.stackroute.junit.UpdateArrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//program to update the array with the given elements
public class UpdateArray
{
public List<String> updateSpecificElement(String givenElement1,int index1,String givenElement2,int index2)
{
    List<String> beforeUpdateArray = new ArrayList<String>(Arrays.asList("apple", "grape", "melon", "berry"));

    try {
        beforeUpdateArray.set(index1, givenElement1);
        beforeUpdateArray.set(index2, givenElement2);
        return beforeUpdateArray;

    }
    catch (IndexOutOfBoundsException e) //return indexoutofboundsexception  if the string is null
    {
        String str3 = "it is indexoutofboundsexception";
        return Arrays.asList(str3);
    }
}
}
