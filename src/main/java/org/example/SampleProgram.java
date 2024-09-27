package main.java.org.example;

import static java.lang.StringTemplate.STR;

public class SampleProgram {

    //main method is nothing but the JAVA Compiler recognises the keyword 'main'
    //to execute the programs

    public static void main(String[] args)
    {
        //Prints the data onto the console ---> "Hello World" and moves the cursor to the next line
        //If we want put any sentence we need to specify within double quotes
        System.out.println("Hello World");

        //Shortcut for writing System.out.println();
        //type sout followed by enter key

        //Shortcut for running the program in Intellij is:
        //CTRL+SHIFT+F10
        System.out.println("This is my first coding class");

        System.out.println(40-200/50);

        //IN JAVA we follow BODMAS Rule for arithmetic operations:
        //Bracket of Division Multiplication, Addition Subraction
        //30-200/2*100+300-200
        //30-100*100+300-200
        //30-10000+300-200
        //130-9700-200
        //-9870
        System.out.println(30-200/2*100+300-200);

        //Prints the data onto the console
        // + is used as a joining operator or concatenation
        System.out.print("Number obtained is: "+(-30*200-30*30+30));

        System.out.print("End of the Code");

        int a=-30*200-30*30+30;

        System.out.println("Number Obtained is: "+a);

        System.out.println(STR."Number Obtained is: \{a}");
    }
}
