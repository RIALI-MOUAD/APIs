package com.example.leagueApi.services;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.leagueApi.model.Clubs;
import com.example.leagueApi.repositories.ClubRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.MongoTemplate.*;

@Service
@AllArgsConstructor
public class ClubService {

    public final ClubRepository clubRepository;


    public List<Clubs> getAllClubs() {
        return clubRepository.findAll();
    }

    public String createClub(Clubs club){
        Clubs insertedClub = clubRepository.insert(club);
        try {
            return "Club created successefully "+insertedClub.getNom();
        }catch (Exception e){
            return "Key Duplicated";
        }
    }

    public List<Clubs> getClubByPays(String pays){
        if(pays.contains("_")){
            pays = pays.replaceAll("_", " ");
        }

        return clubRepository.getByPays(pays);
    }
    public List<Clubs> getClubByVille(String ville){
        if(ville.contains("_")){
            ville = ville.replaceAll("_", " ");
        }

        return clubRepository.getByVille(ville);
    }

    public Clubs getClub(String club){
        if(club.contains("_")){
            club = club.replaceAll("_", " ");
        }

        return clubRepository.getByClub(club);
    }

    public Clubs updatelubs(Clubs club) {
        return clubRepository.save(club);
    }

    public String deleteClubs(Clubs club) {
        try {
            clubRepository.delete(club);
            return "Club Deleted";
        }catch (Exception e){
            return e.toString();
        }
    }

    public String deleteClubByNom(String nom) {
        if(nom.contains("_")){
            nom = nom.replaceAll("_", " ");
        }
        try {
            clubRepository.delByNom(nom);
            return nom+" Deleted";
        }catch(Exception e){
            return "";
        }
    }


    public List<Clubs> getClubByColor(String color){
        //String[] couleur = color;
        return clubRepository.findByCouleurs(color);
        //return clubRepository.f
    }/**/

    public List<Clubs> getLtCapacite(int cap) {
        //int capmax = Integer.valueOf(cap);
        return clubRepository.findByCapaciteLessThan(cap);
    }
}
