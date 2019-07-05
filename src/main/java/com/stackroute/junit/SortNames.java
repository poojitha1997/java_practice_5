package main.java.com.stackroute.junit;

import java.util.ArrayList;
import java.util.List;
    import java.util.TreeSet;
//program to sort the names  in ascending order and coverting in to the arraylist
public class SortNames
{

    public List<String> sortTheNames(TreeSet givenSet)
    {
        if(givenSet.size()==0) //return null if the set is null
            return null;
        List li = new ArrayList();
        li.addAll(givenSet); //converting the treeset into arraylist


        return li;
    }
}
