import java.io.*;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello Worlddd hihihi");

        Console console = System.console();
        String name = console.readLine("What is your name");
        System.out.println("your name is :" + name);
    }
}