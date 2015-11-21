/*
    Testing java.io.Console for output and input instead of
    System.out or Scanner/
*/

import java.io.Console;

public class TestIOConsole{
    public static void main(String[] args){
        Console console = System.console();
        String name = console.readLine("What is your name?  ");
        console.printf("Hi, %s", name);
    }   
}