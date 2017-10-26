
/**
 * Write a description of class Rock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        
        Scanner scan = new Scanner(System.in);
        
        //Get player's play -- note that this is stored as a string
        System.out.print ("Make your move: R, P, or S ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay= personPlay.toUpperCase();
        
        //Generate computer's play (0,1,2)
        
        int computerNum;
        
        computerNum = generator.nextInt(3);
        
        if (computerNum==0) {
            computerPlay="R";
        }
        else if (computerNum==1) {
            computerPlay="P";
        }
        else {
            computerPlay="S";
        }
        
        //Translate computer's randomly generated play to string
        //Print computer's play
        
        //See who won.
        
        System.out.println("Your move:           " +  personPlay);
        System.out.println("The computer play is:            " + computerPlay);
        
        if (computerPlay==personPlay) {
            System.out.println("You made played the same move, Play Again!");
        }
        else if (computerPlay=="R") {
            if (personPlay=="P"){
                System.out.println("Paper covers rock, you win!");
            }
            else {
                System.out.println("Rock crushes scissors, you lose!");
            }
        }
        else if (computerPlay=="P"){
            if (personPlay=="R"){
                System.out.println("Paper covers rock, you lose!");
            }
            else {
                System.out.println("Scissors cut paper, you win!");
            }
        }
        else {
            if (personPlay=="R"){
                System.out.println("Rock crushes scissors, you win!");
            }
            else {
                System.out.println("Scissors cut paper, you lose!");
            }
        }
        
          
    }
}