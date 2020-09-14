package sn.simplon.controller;

import sn.simplon.metier.Db;
import sn.simplon.metier.Etudiant;

import java.sql.ResultSet;

public class EtudiantImpl implements IEtudiant {
    private Db db = new Db();
    private ResultSet resultSet;
    private int ok;

    @Override
    public int add(Etudiant etudiant) {
        String sql = "INSERT into etudiant VALUES (NULL,?,?,?)";

        try {
            db.initPrepar(sql);

            db.getPstm().setString(1,etudiant.getNom());
            db.getPstm().setString(2,etudiant.getPrenom());
            db.getPstm().setInt(3,etudiant.getSalaire());

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
