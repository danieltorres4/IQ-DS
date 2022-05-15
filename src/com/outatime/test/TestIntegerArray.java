package com.outatime.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestIntegerArray {
    public static void main(String[] args) {
        Integer[] myArray = {1,2,3,4,2};

        System.out.println("Array elements: \n");
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        findTheNumberRepeated(myArray);
    }

    public static void findTheNumberRepeated(Integer[] myArray){

        for (int i = 0; i < myArray.length - 1; i++){
            for (int j = i + 1; j < myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    System.out.println("Number repeated: " + myArray[i] + "\n");
                }
            }
        }
    }

}
