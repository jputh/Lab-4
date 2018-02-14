//Name: Jason Puthusseril, Date: 2-14-18
//What's up?
//This project converts hexadecimal to decimal!!!

import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");

        String userInput = in.next();



        if(userInput.substring(0,2).equalsIgnoreCase("0x"))
        {
            userInput = userInput.substring(2);
        }

        int counter = userInput.length() - 1;
        int i = 0;

        double decimalValue = 0;


        while(i < userInput.length())
        {
            int actualValue;

            char singleChar = userInput.charAt(counter);
            String a = Character.toString(singleChar);

            if(a.equalsIgnoreCase("0"))
            {
                actualValue = 0;
            }
            else if(a.equalsIgnoreCase("1"))
            {
                actualValue = 1;
            }
            else if(a.equalsIgnoreCase("2"))
            {
                actualValue = 2;
            }
            else if(a.equalsIgnoreCase("3"))
            {
                actualValue = 3;
            }
            else if(a.equalsIgnoreCase("4"))
            {
                actualValue = 4;
            }
            else if(a.equalsIgnoreCase("5"))
            {
                actualValue = 5;
            }
            else if(a.equalsIgnoreCase("6"))
            {
                actualValue = 6;
            }
            else if(a.equalsIgnoreCase("7"))
            {
                actualValue = 7;
            }
            else if(a.equalsIgnoreCase("8"))
            {
                actualValue = 8;
            }
            else if(a.equalsIgnoreCase("9"))
            {
                actualValue = 9;
            }
            else if(a.equalsIgnoreCase("A"))
            {
                actualValue = 10;
            }
            else if(a.equalsIgnoreCase("B"))
            {
                actualValue = 11;
            }
            else if(a.equalsIgnoreCase("C"))
            {
                actualValue = 12;
            }
            else if(a.equalsIgnoreCase("D"))
            {
                actualValue = 13;
            }
            else if(a.equalsIgnoreCase("E"))
            {
                actualValue = 14;
            }
            else
            {
                actualValue = 15;
            }


            decimalValue += actualValue * Math.pow(16,i);

            i++;
            counter--;

        }

        String decimalNumber = String.valueOf(decimalValue);
        String printedNumber = String.format("%.0f", decimalValue);



        System.out.println("Your number is " + printedNumber + " in decimal");






        }

    }

