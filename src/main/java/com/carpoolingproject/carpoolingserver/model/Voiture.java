package com.carpoolingproject.carpoolingserver.model;

public class Voiture {
    private String id;

    private String nom;

    private int numberOfPlaces;

    public Voiture() {
    }

    public Voiture(String id, String nom, int numberOfPlaces) {
        this.id = id;
        this.nom = nom;
        this.numberOfPlaces = numberOfPlaces;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }
}
