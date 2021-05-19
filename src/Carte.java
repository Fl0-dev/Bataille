/**
 * Class Carte avec
 * attribut Couleur (énumération)
 * attribut Valeur (énumération)
 */
public class Carte {
    private Couleur couleur;
    private Valeur valeur;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
    public Couleur getCouleur() {
        return couleur;
    }
    public Valeur getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur=" + couleur +
                ", valeur=" + valeur +
                '}';
    }
}