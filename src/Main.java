import java.util.Arrays;
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
        char X ="X".charAt(0);
        char O ="O".charAt(0);
        char[][] tableauMorpion = {
                {'A', 'B','C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        int nbTours = 9;
        while (nbTours > 0) {
                System.out.println(Arrays.deepToString(tableauMorpion));
                System.out.println(jUn + ", où voulez vous placer votre X.");
                char reponseJUn = clavier.nextLine().toUpperCase().charAt(0);
                switch (reponseJUn) {
                    case 'A':
                        System.out.println("X placé en A");
                        tableauMorpion[0][0] = X;
                        nbTours -= 1;
                        break;
                    case 'B':
                        System.out.println("X placé en B");
                        tableauMorpion[0][1] = X;
                        nbTours -= 1;
                        break;
                    case 'C':
                        System.out.println("X placé en C");
                        tableauMorpion[0][2] = X;
                        nbTours -= 1;
                        break;
                    case 'D':
                        System.out.println("X placé en D");
                        tableauMorpion[1][0] = X;
                        nbTours -= 1;
                        break;
                    case 'E':
                        System.out.println("X placé en E");
                        tableauMorpion[1][1] = X;
                        nbTours -= 1;
                        break;
                    case 'F':
                        System.out.println("X placé en F");
                        tableauMorpion[1][2] = X;
                        nbTours -= 1;
                        break;
                    case 'G':
                        System.out.println("X placé en G");
                        tableauMorpion[2][0] = X;
                        nbTours -= 1;
                        break;
                    case 'H':
                        System.out.println("X placé en H");
                        tableauMorpion[2][1] = X;
                        nbTours -= 1;
                        break;
                    case 'I':
                        System.out.println("X placé en I");
                        tableauMorpion[2][2] = X;
                        nbTours -= 1;
                        break;
                }
                if (tableauMorpion[0][0]==X && tableauMorpion[1][0]==X && tableauMorpion[2][0]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn+" a gagné !");
                    break;
                } else if(tableauMorpion[0][0]==X && tableauMorpion[0][1]==X && tableauMorpion[0][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn+" a gagné !");
                    break;
                }else if(tableauMorpion[1][0]==X && tableauMorpion[1][1]==X && tableauMorpion[1][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn+" a gagné !");
                    break;
                }else if(tableauMorpion[2][0]==X && tableauMorpion[2][1]==X && tableauMorpion[2][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn + " a gagné !");
                    break;
                } else if(tableauMorpion[0][1]==X && tableauMorpion[1][1]==X && tableauMorpion[2][1]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn + " a gagné !");
                    break;
                } else if(tableauMorpion[0][2]==X && tableauMorpion[1][2]==X && tableauMorpion[2][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn + " a gagné !");
                    break;
                }else if(tableauMorpion[0][0]==X && tableauMorpion[1][1]==X && tableauMorpion[2][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn + " a gagné !");
                    break;
                }else if(tableauMorpion[2][0]==X && tableauMorpion[1][1]==X && tableauMorpion[0][2]==X) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jUn + " a gagné !");
                    break;
                }
                System.out.println(Arrays.deepToString(tableauMorpion));
                System.out.println(jDeux+", où voulez vous placer votre O.");
                char reponseJDeux = clavier.nextLine().toUpperCase().charAt(0);
                switch (reponseJDeux) {
                    case 'A':
                        System.out.println("O placé en A");
                        tableauMorpion[0][0] = O;
                        nbTours -= 1;
                        break;
                    case 'B':
                        System.out.println("O placé en B");
                        tableauMorpion[0][1] = O;
                        nbTours -= 1;
                        break;
                    case 'C':
                        System.out.println("O placé en C");
                        tableauMorpion[0][2] = O;
                        nbTours -= 1;
                        break;
                    case 'D':
                        System.out.println("O placé en D");
                        tableauMorpion[1][0] = O;
                        nbTours -= 1;
                        break;
                    case 'E':
                        System.out.println("O placé en E");
                        tableauMorpion[1][1] = O;
                        nbTours -= 1;
                        break;
                    case 'F':
                        System.out.println("O placé en F");
                        tableauMorpion[1][2] = O;
                        nbTours -= 1;
                        break;
                    case 'G':
                        System.out.println("O placé en G");
                        tableauMorpion[2][0] = O;
                        nbTours -= 1;
                        break;
                    case 'H':
                        System.out.println("O placé en H");
                        tableauMorpion[2][1] = O;
                        nbTours -= 1;
                        break;
                    case 'I':
                        System.out.println("O placé en I");
                        tableauMorpion[2][2] = O;
                        nbTours -= 1;
                        break;
                }
                if (tableauMorpion[0][0]==O && tableauMorpion[1][0]==O && tableauMorpion[2][0]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux+" a gagné !");
                    break;
                } else if(tableauMorpion[0][0]==O && tableauMorpion[0][1]==O && tableauMorpion[0][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux+" a gagné !");
                    break;
                }else if(tableauMorpion[1][0]==O && tableauMorpion[1][1]==O && tableauMorpion[1][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux+" a gagné !");
                    break;
                }else if(tableauMorpion[2][0]==O && tableauMorpion[2][1]==O && tableauMorpion[2][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux + " a gagné !");
                    break;
                } else if(tableauMorpion[0][1]==O && tableauMorpion[1][1]==O && tableauMorpion[2][1]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux + " a gagné !");
                    break;
                } else if(tableauMorpion[0][2]==O && tableauMorpion[1][2]==O && tableauMorpion[2][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux + " a gagné !");
                    break;
                }else if(tableauMorpion[0][0]==O && tableauMorpion[1][1]==O && tableauMorpion[2][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux + " a gagné !");
                    break;
                }else if(tableauMorpion[2][0]==O && tableauMorpion[1][1]==O && tableauMorpion[0][2]==O) {
                    System.out.println(Arrays.deepToString(tableauMorpion));
                    System.out.println(jDeux + " a gagné !");
                    break;
                }

            }if (nbTours==0){
            System.out.println("C'est un match nul !");
        }
        System.out.println("La partie est fini !");
        }

    }
