package test;



class Pendu {

    private char motAleatoire[] ;
    private char hidden[] ;
    private static int perdu = 10;
    public Pendu(){}
    char letter;
   

//créez un liste de mots stockés dans une structure en mémoire

public static String genererMot() {
    String[] motAtrouver = {"Chat", "Loup", "Poisson", "Table", "Pieds", "Voiture", "Camion", "Soleil", "Pluie", "Pomme" };

    //Vous faites un tirage aléatoire d'un mot

    String motAleatoire = motAtrouver [(int) (Math.random() * motAtrouver.length)];
    motAleatoire = motAleatoire.toLowerCase();
    return motAleatoire;
}
   //cache le mot aleatoire par des *  
public String hiddenWord; 
public String motAleatoireCache(String motAleatoire){
    
    for (int i = 0; i < motAleatoire.length(); i++){
        hidden[i] = '*';
    } 
    return hiddenWord;
}
//verifie si la lettre proposer par le joueur fait partie du mot 
public boolean isInside(char letter){
boolean value = false;
        for(int i = 0; i < motAleatoire.length; i++){
            if(motAleatoire[i] == letter){
                value = true;
                break;
            }
        }
        return value;
    }
    public boolean aPerdu(){
    boolean value = false;
    if(perdu <= 0){
        value = true;
    }
    return value;
}


public void replaceChar(char letter){
    for(int i = 0; i < motAleatoire.length; i++){
        if(motAleatoire[i] == letter){
            hidden[i] = letter;
        }
    }
}
        public boolean gagner(){
            int count = 0;
            boolean value = false;
            for(int i = 0; i < motAleatoire.length; i++){
                if(hidden[i] == '*'){
                    value = true;
                    break;
                }
            }
            return value;
        }
}
 