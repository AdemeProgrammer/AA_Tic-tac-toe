import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bienvenue au jeu du morpion (ou tic tac toe ( ou croix rond pour les intimes))");
        System.out.println("Le joueur 1 devra jouer les 'X' et le joueur 2 les 'O'");
        System.out.println("Il faut alligner trois mêmes symboles pour gagner la partie");
        System.out.println("Joueur 1, veuillez entrer votre nom");
        String jUn = clavier.nextLine();
        System.out.println("Joueur 2, à votre tour d'entrer votre nom");
        String jDeux = clavier.nextLine();
        
    }
}