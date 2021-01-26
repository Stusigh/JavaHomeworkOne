// Getting the Absolute Value of an entered integer.

import java.lang.Math;
import java.util.Scanner;

public class homeworkOneProject {
    public static void main(String[] args) {

//        illegal variable name as it starts with a number
//        int 1illegalInteger = 42;
//        System.out.println(1illegalInteger);

        System.out.println("JAVA. IT IS A STATEMENT.");

        System.out.println("java: ';' expected\nJust kidding!");

        String this$houldntBeLegal = "All hail the Hypno Toad"; // this contains the character $ but is still legal?
        System.out.println(this$houldntBeLegal);

        // These are stupidly long and could be shorter, information should be in the comments.
        boolean oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive = true;
        if(oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive) {
            System.out.println(oldCodersSayYouShouldntHaveLongVariableNamesButNowWithIntellisenseAndMoreMemoryWhyShouldntTheNameBeMoreDescriptive);
        }

        //These are different variables as they have different cases.
        int THISISNOTTHAT = 15; // reserved for constants.
        double thisisnotthat = 17.854;
        System.out.println(thisisnotthat + THISISNOTTHAT);


//        float System = 15.5F;
//        You shouldn't use System as a variable name, but you totally can if you don't mind breaking everything.
        System.out.println("java: float cannot be dereferenced. So apparently you *can*!");

        //Below I wrote a program to find the absolute value of an input integer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to get the absolute value: ");
        int numberToBeProcessed = Integer.parseInt(sc.nextLine());
        //Reads in the number to be processed.

        System.out.println("Was that correct? Y/N? ");
        String correctOrNotRaw = sc.nextLine();
        String correctOrNot = correctOrNotRaw.toLowerCase();
        //Makes sure the number is correct and makes sure it's lower case.

        if(correctOrNot.equals("y")) {
            System.out.println(Math.abs(numberToBeProcessed)); //returns the absolute value of the number
        }
        else if(correctOrNot.equals("n")) {
            System.out.println("I'm sorry to hear that. Please run me again.");
        } else {
            System.out.println("I gave you a simple instruction. Run me again, you cretin.");
        }
    }
}