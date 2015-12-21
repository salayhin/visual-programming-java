/****
 * ----------------------------------------
 * Md Sirajus Salayhin <salayhin@gmail.com>
 * ID: 1014311039
 * ----------------------------------------
 *
 * Problem Statement:
 * -----------------
 * Input two numbers, output the bigger number+5, repeat the program untill the
 * second input is 0 (means when you input 0 for second number, the program terminate)
 *
 */

import java.util.Scanner;

public class CheckMaxValue
{
    public static void main(String[] args)
    {
        while (true) {
            Scanner reader = new Scanner(System.in);

            try {
                System.out.println( "Please enter your first number: ");
                String userFirstInput = reader.nextLine();
                int userFirstInputInt = Integer.parseInt(userFirstInput);

                System.out.println( "Please enter your second number: ");
                String userSecondInput = reader.nextLine();
                int userSecondInputInt = Integer.parseInt(userSecondInput);

                if(userSecondInputInt == 0){
                    System.out.println( "You choose 0 as a second value.");
                    break;
                }

                if (userFirstInputInt > userSecondInputInt){
                    int total = userFirstInputInt + 5;
                    System.out.println( "Max number is : " + total);
                }else if(userSecondInputInt > userFirstInputInt) {
                    int total = userSecondInputInt + 5;
                    System.out.println( "Max number is : " + total);
                }

            } catch (NumberFormatException e) {
                System.out.println("Something went wrong!");
            }
        }
    }
}