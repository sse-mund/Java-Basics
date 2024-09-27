package main.java.org.example;

import static java.lang.Math.*;

public class SwictchCase {
    public static void main(String[] args){

    }

    private static Number performOperation(int a, int b, char opr){
        return switch (opr){
            case('+')-> a+b;
            case('*')-> a*b;
            case('-') -> Math.abs(a-b);
            case('/') -> a/b;
            default -> throw new IllegalStateException("Unexpected value: " + opr);
        };
    }

}
