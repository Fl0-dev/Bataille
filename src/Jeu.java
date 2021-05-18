import java.util.Random;

public class Jeu {
    private Joueur j1;
    private Joueur j2;


    public Jeu(Joueur j1, Joueur j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public Joueur getJ1() {
        return j1;
    }
    public Joueur getJ2() {
        return j2;
    }

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
        do {
            valeurAleatoire2 = rand.nextInt(12 + 1);

        }while(valeurAleatoire2 == valeurAleatoire);
        Valeur valeurj2 = Valeur.values()[valeurAleatoire2];
        int couleurAleatoire2;
        do {
            couleurAleatoire2 = rand.nextInt(3+1);
        }while(couleurAleatoire2==couleurAleatoire);
        Couleur couleurj2 = Couleur.values()[couleurAleatoire2];
        System.out.printf("Le joueur2 %s %s a tiré la carte %s de %s%n",j2.getPrenom(),j2.getNom(),valeurj2,couleurj2);
        //si ordinal de la carte j1 est > à celui de j2 : j1 gagne
        if (valeurAleatoire>valeurAleatoire2){
            return j1;
        }else{
            return j2;
        }
}
}
