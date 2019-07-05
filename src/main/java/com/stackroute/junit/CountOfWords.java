package main.java.com.stackroute.junit;

import java.util.HashMap;
import java.util.Map;

//program to count the occurrence of all the words in the string
public class CountOfWords {
    public Map<String, Integer> count(String message) {

        //return null if the string is null
        if(message.length()==0) {
            return null;
        }
        String[] str1 = message.split(" ");
        Map<String,Integer> finalString = new HashMap<String, Integer>();
        for(int i=0; i<str1.length; i++) {
            String[] str2= str1[i].split("-|___|,|@|\\*|\\?");
            for(int j=0; j<str2.length; j++) { //adding the keys and values to the map
                if(str2[j].equals("")) {
                    continue;
                }
                if(finalString.containsKey(str2[j]))
                {
                    finalString.put(str2[j],finalString.get(str2[j])+1);
                }
                else
                    finalString.put(str2[j],1);
            }

        }

        return finalString;
    }
}


