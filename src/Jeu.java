import java.util.Random;

/**
 * Classe Jeu avec en attribut
 * un joueur j1
 * un joueur j2
 * avec une méthode bataille qui permet de faire combattre
 * ces 2 joueurs
 */
public class Jeu {
    private Joueur j1;
    private Joueur j2;
    private Joueur egalite;

    public Jeu(Joueur j1, Joueur j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    /**
     * Fait tirer chaque joueur une carte au hasard
     * compare les deux cartes et
     * @return le joueur gagnant de la manche
     */
    public Joueur bataille(){
        //le j1 tire une carte
        Random rand = new Random();
        int valeurAleatoire = rand.nextInt(12 + 1);
        Valeur valeurj1 = Valeur.values()[valeurAleatoire];
        int couleurAleatoire = rand.nextInt(3+1);
        Couleur couleurj1 = Couleur.values()[couleurAleatoire];
        System.out.printf("Le joueur1 %s %s a tiré la carte %s de %s%n",j1.getPrenom(),j1.getNom(),valeurj1,couleurj1);

        //lej2 tire une carte qui ne soit pas la carte du J1
        int valeurAleatoire2;
            valeurAleatoire2 = rand.nextInt(12 + 1);
        Valeur valeurj2 = Valeur.values()[valeurAleatoire2];
        int couleurAleatoire2;
        do {
            couleurAleatoire2 = rand.nextInt(3+1);
        }while(couleurAleatoire2==couleurAleatoire);
        Couleur couleurj2 = Couleur.values()[couleurAleatoire2];
        System.out.printf("Le joueur2 %s %s a tiré la carte %s de %s%n",j2.getPrenom(),j2.getNom(),valeurj2,couleurj2);
        //compare les 2 valeurs de chaque carte et retourne le gagnant
        if (valeurAleatoire==valeurAleatoire2){
            return egalite;
        }
        else if (valeurAleatoire>valeurAleatoire2){
            return j1;
        }else{
            return j2;
        }
}
}
