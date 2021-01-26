// Getting the Absolute Value of an entered integer.

import java.lang.Math;
import java.util.Scanner;

public class homeworkOneProject {
    public static void main(String[] args) {

//        illegal variable name as it starts with a number
//        int 1illegalInteger = 42;
//        System.out.println(1illegalInteger);

        String this$houldntBeLegal = "All hail the Hypno Toad"; // this contains the character $ but is still legal?
        System.out.println(this$houldntBeLegal);

        // These are stupidly long and could be shorter, information should be in the comments.
        boolean oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive = true;
        if(oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive) {
            System.out.println(oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive);
        }

        //These are different variables as they have different cases.
        int THISISNOTTHAT = 15;
        double thisisnotthat = 17.854;


//        float System = 15.5F;
//        Can't use reserved words as variable names

        //Below I wrote a program to find the absolute value of an input integer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to get the absolute value: ");
        int numberToBeProcessed = Integer.parseInt(sc.nextLine());

        System.out.println("Was that correct? Y/N? ");
        String correctOrNotRaw = sc.nextLine();
        String correctOrNot = correctOrNotRaw.toLowerCase();

        if(correctOrNot.equals("y")) {
            System.out.println(Math.abs(numberToBeProcessed));
        }
        else if(correctOrNot.equals("n")) {
            System.out.println("I'm sorry to hear that. Please run me again.");
        } else {
            System.out.println("I gave you a simple instruction. Run me again, you cretin.");
        }
    }
}