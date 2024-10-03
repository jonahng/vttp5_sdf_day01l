import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class classpractice2{
    public static void main(String[] args){
        /* Console console = System.console();
        Integer[] numbers = new Integer[9];
        for(int k = 0;k<9; k++){
            Integer inputNumber = Integer.parseInt(console.readLine("Enter your %d number",k));
            numbers[k] = inputNumber;
            System.out.println("Your numbers so far are" + numbers[k]); */
            /* if (args.length > 0){
                String[] names = new String[5];
                int x = 0;
                while(x<args.length){
                    names[x] = args[x];
                    x++;
                }
                for(int y=0;y <names.length; y++){
                    System.out.printf("Name[%d]: %s",y, names[y]);

                }
            }
            else{
                System.out.println("No argument entered");
            }

        }
        List<String> extraNames = new ArrayList<>();
        String input = "";
        Console console = System.console();

        do{
            
            input = console.readLine("Insert name");
            extraNames.add(input);

        }while(!input.equals("quit"));
        for(String name: extraNames){
            System.out.println(name); */

         List<String> words = new ArrayList<>();
         Console console = System.console();
         String input = "";
         input = console.readLine("Write some words");
         Scanner scan = new Scanner(input);
         while(scan.hasNext()){
            words.add(scan.next());
         }
         scan.close(); //this is to close the scananer and release the memory

         for(String word: words){
            System.out.println(word);
         }

        }
    }
