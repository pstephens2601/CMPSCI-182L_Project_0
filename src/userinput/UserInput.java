/*
 * 
 * 
 */
package userinput;

import java.util.Scanner;
import java.io.IOException;


public class UserInput {

    public static void main(String[] args) {
       
        String testString;
        /*
        System.out.print("Please enter a string: ");
       
        testString = getString();
        System.out.print("The value returned by getString() is: " + testString + "\n");
       
        System.out.print("Please enter a string between 2 and 5 characters in length: ");
        testString = getString(2,5);
        System.out.print("The value returned by getString(int min, int max) is: " + testString + "\n");
        
        System.out.print("Please enter a char: ");
        char testChar = getChar();
        System.out.print("The value returned by getChar() is: " + testChar + "\n");
        
        System.out.print("Please enter a char between a and d: ");
        testChar = getChar('a', 'd');
        System.out.print("The value returned by getChar(char min, char max) is: " + testChar + "\n");
        
        System.out.print("Please enter a double: ");
        double testDouble = getDouble();
        System.out.print("The value returned by getDouble() is: " + testDouble + "\n");
        
        System.out.print("Please enter a double between 2.0 and 3.0: ");
        testDouble = getDouble(2.0, 3.0);
        System.out.print("The value returned by getDouble(double min, double max) is: " + testDouble + "\n");
        */
        System.out.print("Please enter an int: ");
        int testInt = getInt();
        System.out.print("The value returned by getInt() is: " + testInt + "\n");
        
        System.out.print("Please enter an int between 2 an 6: ");
        testInt = getInt(2, 6);
        System.out.print("The value returned by getInt(int min, int max) is: " + testInt + "\n");
    }
    
    public static String getString() {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
  
    }
    
    public static String getString(int min, int max) {
        
        String newString = getString();
        
        while (newString.length() < min || newString.length() > max) {
            System.out.print("Please enter between " + min + " and " + max + " characters: ");
            newString = getString();
        }
                
        return newString;
        
    }

    public static char getChar() {

        Scanner input = new Scanner(System.in);
        
        String newString;
        char newChar;
        
        newString = input.nextLine();
        
        while (newString.length() > 1) {
            System.out.print("Please enter only 1 character: ");
            newString = input.nextLine();
        }
        
        newChar = newString.charAt(0);
    
        return newChar;
    }
    
    public static char getChar(char min, char max) {

        char newChar = getChar();
                
        while (newChar < min || newChar > max) {
            System.out.print("Please enter a character between " + min + " and " + max + ": ");
            newChar = getChar();
        }
        
        return newChar;
    }

    public static double getDouble() {

        Scanner input = new Scanner(System.in);
        
        double aDub = input.nextDouble();
        return aDub;
    }
    
    public static double getDouble(double min, double max) {
        
        double newDouble = getDouble();
        
         while (newDouble < min || newDouble > max) {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            newDouble = getDouble();    
        }
        
        return newDouble;
    }
    
    public static int getInt() {

        Scanner input = new Scanner(System.in);
        
        int i = 0;
        
        while (true) {
            
            String userInput = input.nextLine();
            
            try { 
                 return Integer.parseInt(userInput);
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a number:");
            }
        }
    }
    
    public static int getInt(int min, int max) {
       
        int newInt = getInt();
        
        while (newInt < min || newInt > max) {
            
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            
            newInt = getInt();    
        }
        
        return newInt;
    }  
}