package sn.simplon.metier;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }



    public Etudiant(){
    }

    public Etudiant(int idE, String nomE, String prenomE, int salaireE) {
        this.id = idE;
        this.nom = nomE;
        this.prenom = prenomE;
        this.salaire = salaireE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
