import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	// import initialisation;
	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();
	
	// clear function to clear the terminal;
    static void clear(){
        System.out.print("\033[H\033[2J");
    }
    
    // exit function to exit the program;
    static void exit(){
        System.exit(0);
    }
    
    /* MAIN */
    public static void main(String[] args) {
	//menu;
	System.out.print("\nQ To Quit, S to Start: ");
	String MenuInp = sc.next().toLowerCase();
		
	if (MenuInp.startsWith("q")) {
		return; //menu quit;
	}else {
	// Game Variables    
	    int TotalNumbers=100;
	    int Level=1;
	    int Guess=0;
	    int RndNumber;
            String cmd="";
            while (true) { //game loop;
		System.out.println("\n-------------Level: " + Level + "-------------");
		RndNumber = 1 + rnd.nextInt(TotalNumbers); //Computer Guess

		System.out.println("\nComputer has chosen it's Number from 1 To " + TotalNumbers);

		System.out.println("\n----------------------------------");
		// game loop with condition;
		while (Guess != RndNumber) {
		    try {
		        System.out.print("\nEnter a Number: ");
			cmd = sc.next().toLowerCase(); //Usr Input
						
			Guess = Integer.parseInt(cmd);
			if (Guess == RndNumber) {
				break; //Beak from Game condition Loop;
			}					    	

			System.out.print("\nYou Guessed The Wrong Number!");

			if (Guess < RndNumber) {
				System.out.println(" Try Entering a larger number.");
			} else {
				System.out.println(" Try Entering a smaller number.");
			}
					
			// Exception    
		    }catch(NumberFormatException e){
			if(cmd.equals("clear()")){
			    clear();
			}else if(cmd.equals("quit()") || cmd.equals("exit()")){
				exit();
			}else{
			    System.out.println("\nInvalid Input ! Enter a Number.");      
			}
		    }
					
	        }
		System.out.println("\nYou Guessed the Number!");
		System.out.println("\n");
		// Reset Variables
		Guess=0;
			    
		// Increment Variables
		TotalNumbers += 100;
		Level += 1;
		// Logic For Next level
			//Empty
				}
			}
		}
	}	        //Empty