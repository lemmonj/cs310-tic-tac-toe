package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE
        if(isXTurn == true){
            System.out.println("It is X's turn.");
            System.out.print("Enter the row and column numbers, separated by a space: ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();
            TicTacToeMove xMove = new TicTacToeMove(row,col);
            return xMove;
        }
        else if(){
        if(isXTurn == false){
            System.out.println("It is O's turn.");
            System.out.print("Enter the row and the col number, separated by a space: ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();
            TicTacToeMove oMove = new TicTacToeMove(row,col);
            return oMove;            
        }
    

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
