package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int water = 1;
        int colae = 2;
        int glenRioAle = 3;

        System.out.println("Please enter a number 1, 2, or 3.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int numberEntered = input.nextInt();

        if (numberEntered == 1)
        {
            System.out.println("Here is your water!");
        }
        if (numberEntered == 2)
        {
            System.out.println("Here is your cola!");
        }

        if (numberEntered == 3)
        {
            System.out.println("Please enter age.");
            int numberEntered2 = input.nextInt();
            if (numberEntered2 >= 21)
            {
                System.out.println("Here is your Glen Rio Ale!");
            }
            else
            {
                int years = 21 - numberEntered2;
                if (years == 1)
                {
                    System.out.println("No beer for you! Come back in " + years + " year!");
                }
                else
                {
                    System.out.println("No beer for you! Come back in " + years + " years!");
                }
            }
        }
    }
}
