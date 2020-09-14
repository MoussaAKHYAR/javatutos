package presentation;

import sn.simplon.controller.EtudiantImpl;
import sn.simplon.controller.IEtudiant;
import sn.simplon.metier.Etudiant;

public class Main {

    public static void main(String[] args) {

     /**   Etudiant etudiant = new Etudiant(1,"Mor","Pir",150000);

        etudiant.setNom("Moussa");

       // System.out.print("Identifiant: "+etudiant.getId()+"\n"+"Nom de l'étudiant: "+etudiant.getNom()+
                         //  "\n"+"Prenom de l'etudiant: "+etudiant.getPrenom()+"\n"+"Salaire: "+etudiant.getSalaire() );

        System.out.print(etudiant.getNom()+"dfg");
        System.out.println(etudiant.getNom()+"ghjk");
        System.out.print("dfff");
      */
        Etudiant etudiant = new Etudiant();


        IEtudiant ietudiant = new EtudiantImpl();

        etudiant.setNom("Sy");
        etudiant.setPrenom("Coumba");
        etudiant.setSalaire(15000000);

        ietudiant.add(etudiant);


    }
}
