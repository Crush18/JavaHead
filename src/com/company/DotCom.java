package com.company;
import java.util.ArrayList;

public class DotCom {
//    int[] locationCells;
    private ArrayList<String> locationCells;

//    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
//        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0){
            result = "hit";
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            }
        }

        System.out.println(result);
        return result;
    }
}
