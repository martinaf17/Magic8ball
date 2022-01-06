/**
 * This program simulates a simple magic 8 ball.
 * It's a simple practice for Encapsulation, control loops, Scanner class.
 */

import java.util.Scanner;

public class Magic8 {

    public void Shell(){
        String yesNo, text;
        Scanner scan = new Scanner(System.in);

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("__      __  ");
        System.out.println(" ||\\  /|| ");
        System.out.println(" || \\/ || ");
        System.out.println("_||    ||_AGIC 8 BALL");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        System.out.println("User, are you ready to know your future? \nType Yes or No.");
        yesNo = scan.nextLine();
        if (yesNo.equalsIgnoreCase("no")){
            System.out.println("Come back when you are.");
            //firstTime=true;

        } else if(yesNo.equalsIgnoreCase("yes")) {
            System.out.println("Okay, ask me something!");
            text = scan.nextLine();
            //firstTime=false;
            generateFortune();

        } else {
            System.out.println("Yes or no answers only!");
            //firstTime=true;
            Shell();
        }
    }

    public void Shell_2(){
        String yesNo, text;
        Scanner scan = new Scanner(System.in);

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Would you like to know something more?");
        yesNo = scan.nextLine();
        if (yesNo.equalsIgnoreCase("no")) {
            System.out.println("Farewell dear user.");

        } else if (yesNo.equalsIgnoreCase("yes")) {
            System.out.println("Ask away:");
            text = scan.nextLine();
            generateFortune();

        } else {
            System.out.println("Yes or no answers only!");
        }
    }

    public void generateFortune(){
        int min = 1;
        int max = 20;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        switch (random_int){
            case 1:
                System.out.println("It is certain.");
                break;
            case 2:
                System.out.println(" It is decidedly so.");
                break;
            case 3:
                System.out.println("Without a doubt.");
                break;
            case 4:
                System.out.println("Yes definitely.");
                break;
            case 5:
                System.out.println("You may rely on it.");
                break;
            case 6:
                System.out.println("As I see it, yes.");
                break;
            case 7:
                System.out.println("Most likely.");
                break;
            case 8:
                System.out.println(" Outlook good.");
                break;
            case 9:
                System.out.println("Yes.");
                break;
            case 10:
                System.out.println("Signs point to yes.");
                break;
            case 11:
                System.out.println("Reply hazy, try again.");
                break;
            case 12:
                System.out.println(" Ask again later.");
                break;
            case 13:
                System.out.println(" Better not tell you now.");
                break;
            case 14:
                System.out.println(" Cannot predict now.");
                break;
            case 15:
                System.out.println(" Concentrate and ask again.");
                break;
            case 16:
                System.out.println("Don't count on it.");
                break;
            case 17:
                System.out.println(" My reply is no.");
                break;
            case 18:
                System.out.println("My sources say no.");
                break;
            case 19:
                System.out.println("Outlook not so good.");
                break;
            case 20:
                System.out.println("Very doubtful.");
                break;
        }
        Shell_2();
    }

    public static void main (String arg[]){
        Magic8 newFortune = new Magic8();
        newFortune.Shell();
    }

}
