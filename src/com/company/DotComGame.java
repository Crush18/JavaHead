package com.company;

import java.util.ArrayList;

public class DotComGame {

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        int randomNum = (int)(Math.random() * 5);
        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum+2));

//        int[] locations = {randomNum, randomNum+1, randomNum+2};

        DotCom theDotCom = new DotCom();
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}

