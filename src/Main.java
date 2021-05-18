import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //instance du J1
        System.out.println("Quel sera le prénom du joueur 1 ?");
        String prenomJ1 = sc.nextLine();
        System.out.println("Quel sera le nom du joueur 1 ?");
        String nomJ1 = sc.nextLine();
        Joueur j1 = new Joueur(nomJ1, prenomJ1);

        //instance du J2
        System.out.println("Quel sera le prénom du joueur 2 ?");
        String prenomJ2 = sc.nextLine();
        System.out.println("Quel sera le nom du joueur 2 ?");
        String nomJ2 = sc.nextLine();
        Joueur j2 = new Joueur(nomJ2, prenomJ2);
        //instance du jeu

        System.out.println("Combien de manche voulez-vous jouer?");
        int compteurJ1=0;
        int compteurJ2=0;
        int nbMmanche = sc.nextInt();
        for (int i = 0; i < nbMmanche; i++) {
            Jeu manche = new Jeu(j1, j2);
            if (j1 == manche.bataille()){
                    compteurJ1++;
                    //affichage j1 gagnant de la manche
                System.out.printf("%s %s a gagné%n",j1.getPrenom(),j1.getNom());
            } else{
                compteurJ2++;
                //affichage j2 gagnant de la manche
                System.out.printf("%s %s a gagné%n",j2.getPrenom(),j2.getNom());
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
