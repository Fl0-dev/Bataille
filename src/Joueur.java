/**
 *Class joueur avec en attribut
 * nom du joueur (String)
 * prénom du joueur (String)
 */
public class Joueur {
    private String nom;
    private String prenom;

    /**
     * Constructeur
     * @param nom du joueur
     * @param prenom du joueur
     */
    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    ////////////Getters/////////////
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

}
