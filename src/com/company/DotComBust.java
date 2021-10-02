package com.company;

import java.util.ArrayList;

public class DotComBust {

    private int numOfGuesses = 0;
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>(3);

    public void setUpGame(){
        //make three DotCom objects and name them

        String[] DotComName = {"Pets.com", "Go2.com", "Rabbit.com"};
        for (int i = 0; i < 3; i++) {
            DotCom dot = new DotCom();
            dot.setDotComName(DotComName[i]);
            dotComsList.add(dot);
        }

        for (DotCom dotComToSet:dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom();
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        // evaluate three dotcom
        while(!dotComsList.isEmpty()){
            String guess = helper.getUserInput("Enter a guess");
            checkUserGuess(guess);
        }

        finishGame();
    }

    public void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for (DotCom dot : dotComsList) {
            result = dot.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComsList.remove(dot);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("Game Over");
        if (numOfGuesses < 18){
            System.out.println("It only took you " + numOfGuesses + " guesses");
        }else{
            System.out.println("Took you too long enough " + numOfGuesses + " guesses");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

