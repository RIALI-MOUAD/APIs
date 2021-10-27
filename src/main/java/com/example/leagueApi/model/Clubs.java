package com.example.leagueApi.model;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.Arrays;

@NoArgsConstructor
@Document(collection = "clubs")
public class Clubs {
    @Id
    public BigInteger id;

    @Field(value = "dateC")
    public Integer dateC;

    @Field(value = "nom")
    @Indexed(unique = true)
    public String nom;

    @Field(value = "adresseC")
    public String adresseC;

    @Field(value = "pays")
    public String pays;

    @Field(value = "Tel")
    public String Tel;

    @Field(value = "Fax")
    public String Fax;

    @Field(value = "siteOff")
    public String siteOff;

    @Field(value = "Couleurs")
    public String[] couleurs;

    @Field(value = "Stade")
    public String Stade;

    @Field(value = "Ville")
    public String Ville;

    @Field(value = "AdresseS")
    public String AdresseS;

    @Field(value = "capacite")
    public Integer capacite;

    @Field(value = "Inauguration")
    public Integer Inauguration;

    @Field(value = "Architecte")
    public String Architecte;

    public Clubs(BigInteger id, Integer dateC, String nom, String adresseC, String pays,
                String tel, String fax, String siteOff, String[] couleurs, String stade,
                String ville, String adresseS, Integer capacite, Integer inauguration, String architecte) {
        this.id = id;
        this.dateC = dateC;
        this.nom = nom;
        this.adresseC = adresseC;
        this.pays = pays;
        Tel = tel;
        Fax = fax;
        this.siteOff = siteOff;
        couleurs = couleurs;
        Stade = stade;
        Ville = ville;
        AdresseS = adresseS;
        capacite = capacite;
        Inauguration = inauguration;
        Architecte = architecte;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getDateC() {
        return dateC;
    }

    public void setDateC(Integer dateC) {
        this.dateC = dateC;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseC() {
        return adresseC;
    }

    public void setAdresseC(String adresseC) {
        this.adresseC = adresseC;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getSiteOff() {
        return siteOff;
    }

    public void setSiteOff(String siteOff) {
        this.siteOff = siteOff;
    }

    public String[] getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(String[] couleurs) {
        couleurs = couleurs;
    }

    public String getStade() {
        return Stade;
    }

    public void setStade(String stade) {
        Stade = stade;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getAdresseS() {
        return AdresseS;
    }

    public void setAdresseS(String adresseS) {
        AdresseS = adresseS;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        capacite = capacite;
    }

    public Integer getInauguration() {
        return Inauguration;
    }

    public void setInauguration(Integer inauguration) {
        Inauguration = inauguration;
    }

    public String getArchitecte() {
        return Architecte;
    }

    public void setArchitecte(String architecte) {
        Architecte = architecte;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id='" + id + '\'' +
                ", dateC=" + dateC +
                ", nom='" + nom + '\'' +
                ", adresseC='" + adresseC + '\'' +
                ", pays='" + pays + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Fax='" + Fax + '\'' +
                ", siteOff='" + siteOff + '\'' +
                ", Couleurs=" + Arrays.toString(couleurs) +
                ", Stade='" + Stade + '\'' +
                ", Ville='" + Ville + '\'' +
                ", AdresseS='" + AdresseS + '\'' +
                ", Capacite=" + capacite +
                ", Inauguration=" + Inauguration +
                ", Architecte='" + Architecte + '\'' +
                '}';
    }
}
