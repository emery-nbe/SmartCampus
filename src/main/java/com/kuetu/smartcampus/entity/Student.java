package com.kuetu.smartcampus.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matricule;

    private String nom, postnom, prenom;
    private Date date_naissance;
    private Adresse adresse;
    private String phone, email;
    private String nom_tuteur, tel_tuteur, email_tuteur;

    @ManyToOne
    @JoinColumn(name = "id_promotion")
    private Promotion promotion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom_tuteur() {
        return nom_tuteur;
    }

    public void setNom_tuteur(String nom_tuteur) {
        this.nom_tuteur = nom_tuteur;
    }

    public String getTel_tuteur() {
        return tel_tuteur;
    }

    public void setTel_tuteur(String tel_tuteur) {
        this.tel_tuteur = tel_tuteur;
    }

    public String getEmail_tuteur() {
        return email_tuteur;
    }

    public void setEmail_tuteur(String email_tuteur) {
        if (email_tuteur == null)
            this.email_tuteur = "no@email.com";
        else
            this.email_tuteur = email_tuteur;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
