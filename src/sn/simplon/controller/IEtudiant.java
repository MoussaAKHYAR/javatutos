package sn.simplon.controller;

import sn.simplon.metier.Etudiant;

public interface IEtudiant {

    public Etudiant add(Etudiant etudiant);
    public int delete(int id);
}
