public class Jeu {
    Joueur j1;
    Joueur j2;

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
        int valeurAleatoire = (int) (Math.random() * 13);
        Valeur valeurj1 = Valeur.values()[valeurAleatoire];
        int couleurAleatoire = (int)(Math.random()* 3);
        Couleur couleurj1 = Couleur.values()[couleurAleatoire];

        //lej2 tire une carte qui ne soit pas la carte du J1//TODO
        int valeurAleatoire2 = (int) (Math.random() * 13);
        Valeur valeurj2 = Valeur.values()[valeurAleatoire];
        int couleurAleatoire2 = (int)(Math.random()* 3);
        Couleur couleurj2 = Couleur.values()[couleurAleatoire];
        //si ordinal de la carte j1 est > à celui de j2 : j1 gagne
        //TODO

        return Joueur;
}
}
