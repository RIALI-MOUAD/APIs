package com.example.leagueApi.services;

import com.example.leagueApi.model.Joueurs;
import com.example.leagueApi.repositories.JoueursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JoueurService {

    public final JoueursRepository joueursRepository;

    public List<Joueurs> fetchAllPlayers() {
        return joueursRepository.findAll();
    }


    public List<Joueurs> fetchAllByPays(String pays) {
        return joueursRepository.findByPays(pays);
    }

    public List<Joueurs> fetchAllByClub(String club) {
        return joueursRepository.findByClub(club);
    }

    public Joueurs ajoutJoueur(Joueurs joueurs) {
        return (Joueurs) joueursRepository.insert(joueurs);
    }
}
