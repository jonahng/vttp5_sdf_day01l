import java.io.*;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello Worlddd hihihi");

        Console console = System.console();
        String name = console.readLine("What is your name");
        System.out.println("your name is :" + name);
        String lameName = name.replace('a', 'z');
        System.out.printf("Your name is %s now",lameName);

        String sport = console.readLine("what sport you likee>");
        if(sport.toLowerCase().equals("badminton")){
            System.out.println("ay that is cool");
        }
        else{
            System.out.println("That is alright! good sport");
        }

        String valueString = console.readLine("What is the score");
        Integer score = Integer.parseInt(valueString);

        switch(score){
            case 10:
                System.out.println("nice ");
                break;
            default:
                System.out.println("nooooo");

        }

    int i = 9;
    while(i > score){
        System.out.print("i value test" + i);
        i--;
    }
    do{
        System.out.println("Trying the do while");
    }while(i>score);


    }
}