package com.kuetu.smartcampus.entity;

public class Adresse {
    private int id;
    private String avenue;
    private int numero;
    private String quartier, commune, ville;

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        if (ville == null)
            this.ville = "Kinshasa";
        else
            this.ville = ville;
    }
}
