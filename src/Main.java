import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class principale pour un jeu de bataille
 * entre 2 joueurs qui tire chacun 1 carte au hasard dans un paquet de 52 cartes
 * @date 19 mai 2021
 * @author florian Girard
 * @version 1.0
 */
public class Main{

    public static void main(String[] args){
        //Création d'un scanner
        Scanner sc =new Scanner(System.in);

        //instance du J1 après avoir scanner les saisies du joueur
        System.out.println("Quel sera le prénom du joueur 1 ?");
        String prenomJ1 = sc.nextLine();
        System.out.println("Quel sera le nom du joueur 1 ?");
        String nomJ1 = sc.nextLine();
        Joueur j1 = new Joueur(nomJ1, prenomJ1);

        //instance du J2 après avoir scanner les saisies du joueur
        System.out.println("Quel sera le prénom du joueur 2 ?");
        String prenomJ2 = sc.nextLine();
        System.out.println("Quel sera le nom du joueur 2 ?");
        String nomJ2 = sc.nextLine();
        Joueur j2 = new Joueur(nomJ2, prenomJ2);

        //instance du jeu après avoir demander le nombre de manche à jouer
        int nbMmanche;
        //boucle pour que la saisie soit bien un int>0
        while(true) {
            System.out.println("Combien de manche voulez-vous jouer? (nombre supérieur à 0)");
            try {
                nbMmanche = sc.nextInt();
                //levée d'exception si nbManche <=0
            if (nbMmanche<=0){
                throw new IntException("Le nombre de manche doit être supérieur à 0");
            }
                break;
            //traitement de l'exception nbManche !=int
            }catch(InputMismatchException e) {
                System.err.println("Saisie incorrecte");
                //traitement de l'exception nbManche <=0
            }catch (IntException e){
                System.err.println("Le nombre de manche doit être supérieur à 0");
            }finally {
                sc.nextLine();
            }
        }
        int compteurJ1=0;
        int compteurJ2=0;


        for (int i = 0; i < nbMmanche; i++) {
            Jeu manche = new Jeu(j1,j2);
            if (j1 == manche.bataille()){
                    compteurJ1++;
                    //affichage j1 gagnant de la manche
                System.out.printf("%s %s a gagné%n",j1.getPrenom(),j1.getNom());
            } else if (j2 == manche.bataille()){
                compteurJ2++;
                //affichage j2 gagnant de la manche
                System.out.printf("%s %s a gagné%n",j2.getPrenom(),j2.getNom());
            } else{
                System.out.println("Egalité! Un point pour chaque.");
            }
        }
        //affichage du gagnant
        if (compteurJ1==compteurJ2) {
            System.out.printf("Les 2 joueurs %s %s et %s %S sont à égalité : %d manches partout",prenomJ1,nomJ1,prenomJ2,nomJ2,compteurJ1);
        }else if (compteurJ1>compteurJ2){
            System.out.printf("Le joueur 1 %s %s a gagné : %d à %d",prenomJ1,nomJ1,compteurJ1,compteurJ2);
        }else{
            System.out.printf("Le joueur 1 %s %s a gagné : %d à %d",prenomJ2,nomJ2,compteurJ2,compteurJ1);
        }

    }
}
