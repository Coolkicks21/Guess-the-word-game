import java.util.Scanner;

public class guess_game {
    public static void main(String []args){
    Scanner keyboardInput = new Scanner(System.in);
        String secretword = "happy"; //the secret word (to change it = remove happy)
        String guess = ""; //users input
        int countguess = 0;
        int maxguess = 3; //how many tries to give them
        boolean guess1 = false;

        System.out.println ("Hint: its an emotion you feel"); // a hint to help the player guess more accurately

        while (!guess.equals(secretword) && !guess1){

            if(countguess < maxguess){ //code for how we make it track how many guesses you have
                System.out.println ("ENTER THE GUESS: ");
                guess = keyboardInput.nextLine(); //allows the user to input his word
                countguess++; //so it wont go in a infinite loop
            } else {
                guess1 = true;
            }

        }
        if (guess1){ // the comments displayed when user either wins or losses
            System.out.println("you lose");
        } else {
            System.out.println("you win");
        }





    }

}
