package com.example.ms_candidate.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity()
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6711457437559348053L;
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private String email;

    public Candidat() {
        super();

    }
    public Candidat(String nom) {
        this.nom = nom;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
