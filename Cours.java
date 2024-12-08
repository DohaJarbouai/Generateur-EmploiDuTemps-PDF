package application;

public class Cours {
    private String nom;
    private String enseignant;
    private String salle;
    private String horaire;
    private String jour;

    // Constructeur
    public Cours(String nom, String enseignant, String salle, String horaire, String jour) {
        this.nom = nom;
        this.enseignant = enseignant;
        this.salle = salle;
        this.horaire = horaire;
        this.jour = jour;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }
}
