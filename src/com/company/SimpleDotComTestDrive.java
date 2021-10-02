package com.company;

import java.util.ArrayList;

// 测试码
public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        DotCom dot = new DotCom();

//        int[] locations = {2, 3, 4};
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
