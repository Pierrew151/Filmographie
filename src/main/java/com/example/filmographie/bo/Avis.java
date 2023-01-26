package com.example.filmographie.bo;

public class Avis {
    private int id;
    private Film film;
    private String avis;
    private int note;

    public Avis(int id, Film film, String avis, int note) {
        this.id = id;
        this.film = film;
        this.avis = avis;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
