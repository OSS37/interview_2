package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String [] args){

        List<String> names = new ArrayList<>();

        names.add("Галина");
        names.add("Светлана");


        List <String> updateNames = removeFirstLetterAndSort(names);

        for (String name : updateNames) {
            System.out.println(name);
        }
    }

    public static List <String> removeFirstLetterAndSort (List <String> names){

        List <String> updateNames = new ArrayList<>();

        for (String name : names){
            if(name.length()>1){
                String updateName = name.substring (1);
                updateNames.add(updateName);
            }
        }
        Collections.sort(updateNames);
        return updateNames;
    }
}