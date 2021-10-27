package com.example.leagueApi.model;


import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;

//@Entity
@Document(collection = "joueurs")
@NoArgsConstructor
public class Joueurs {
    @Id
    private BigInteger id;

    @Field(value = "nom")
    private String nom;

    @Field(value = "club")
    private String club;

    @Field(value = "pays")
    private String pays;

    @Field(value = "age")
    private Integer age;

    @Field(value = "long")
    private Long longeur;

    @Field(value = "score")
    private Long score;

    public Joueurs(String nom, String club, String pays, Integer age, Long longeur, Long score) {
        this.nom = nom;
        this.club = club;
        this.pays = pays;
        this.age = age;
        this.longeur = longeur;
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getLongeur() {
        return longeur;
    }

    public void setLongeur(Long longeur) {
        this.longeur = longeur;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
