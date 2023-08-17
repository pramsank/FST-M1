package src.Activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] numArray = {10, 77, 18, 54, -11, 10};
        //print original array - casting int array to string
        System.out.println("Original Array: " + Arrays.toString(numArray));

        //set constants
        int searchNum = 10;
        int fixedNum = 30;

        //print content
        System.out.println(fixedNum);
    }

    public static boolean results(int[] numbers, int searchNum, int fixedSum) {
        int temp_value = 0;
        for (int number : numbers) {
            //if value is 10 the add it to temp_value
            if (number == searchNum) {
                //Add it
                temp_value += searchNum;
            }
            //sum should not be more than 30
            if (temp_value > fixedSum) {
                break;
            }
        }
        //return true if condition satisfies
        return temp_value == fixedSum;
    }
}


