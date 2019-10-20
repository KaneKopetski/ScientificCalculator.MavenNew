package com.zipcodewilmington.scientificcalculator;

import jdk.internal.loader.AbstractClassLoaderValue;
import sun.tools.jar.Main;

public class Operations {
    static Double num1;
    static Double num2;

    public static void performArithmeticOperation(Integer selection) {


        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.addition(num1, num2);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.subtraction(num1, num2);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.multiplication(num1, num2);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.division(num1, num2);
                MainMenu.mainMenu();
                break;
            case 5:
                Submenu.arithmeticMenu();
                break;
            case 6:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.arithmeticMenu();

        }


    }

    public static void performTrigonometryOperation (Integer selection) {

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a double.");
                Trigonometry.tangent(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a double.");
                Trigonometry.sine(num1);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Trigonometry.cosine(num1);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter another double.");
                Trigonometry.atangent(num1);
                MainMenu.mainMenu();
                break;
            case 5:
                num1 = Console.getDoubleInput("Enter a double.");
                Trigonometry.acos(num1);
                MainMenu.mainMenu();
                break;
            case 6:
                num1 = Console.getDoubleInput("Enter a double.");
                Trigonometry.asin(num1);
                MainMenu.mainMenu();
                break;
            case 7:
                Submenu.trigonometryMenu();
                break;
            case 8:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.trigonometryMenu();
        }

    }

    public static void performExponentOperation (Integer selection) {

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a double.");
                Exponents.square(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a double.");
                Exponents.cubed(num1);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a double.");
                num2 = Console.getDoubleInput("Enter a double.");
                Exponents.variableExponent(num1, num2);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a double.");
                Exponents.sqrt(num1);
                MainMenu.mainMenu();
            case 5:
                Submenu.exponentsMenu();
                break;
            case 6:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.trigonometryMenu();
        }

    }

    public static void performInversionOperation (Integer selection) {

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a double.");
                //Inversion.methodName(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                Submenu.inversionMenu();
                break;
            case 3:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.inversionMenu();
        }

    }

    public static void performLogarithmOperation (Integer selection) {

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a double.");
                //Inversion.methodName(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                //Submenu.logarithmMenu();
        }

    }


}