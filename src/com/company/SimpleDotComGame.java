package com.company;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        int randomNum = (int)(Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        SimpleDotCom theDotCom = new SimpleDotCom();
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}

