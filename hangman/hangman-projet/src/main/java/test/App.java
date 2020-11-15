package test;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args){
         
        Pendu pendu= new Pendu();
        System.out.println("le jeu du pendu!"); 
        
    Scanner userInputReader = new Scanner(System.in);
    char letter;
    
  do{
    
    System.out.print("\nEnter a letter: ");
    char letter;
    char lettre = userInputReader.nextLine().charAt(0);
    
    if(pendu.isInside(letter)){
    pendu.replaceChar(letter);
    System.out.print("### cool la lettre fait partie du mot! ###\n");
    }
    else{
    System.out.print("### try again! ###\n");
    }
}

    while(!pendu.aPerdu() && !pendu.gagner());
    if(pendu.gagner()){
    System.out.print("\n################\n");
    System.out.print("### yeahhh !! ###\n");
    System.out.print("#################\n\n");
    }
    else if(pendu.aPerdu()){
    System.out.print("\n##########################################\n");
    System.out.print("### looser .. ###\n");
    System.out.print("##########################################\n\n");
    }
}
}
  
		






