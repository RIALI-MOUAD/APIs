package com.example.leagueApi.controllers;

import com.example.leagueApi.model.Joueurs;
import com.example.leagueApi.services.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joueurs")
@AllArgsConstructor
public class JoueursController {

    public final JoueurService joueurService;

    @GetMapping("/all")
    List<Joueurs> getAllJoueurs(){
        return joueurService.fetchAllPlayers();
    }

    @GetMapping("/natio/{pays}")
    List<Joueurs> getAllByPays(@PathVariable String pays){
        return joueurService.fetchAllByPays(pays);
    }

    @GetMapping("/ville/")
    List<Joueurs> getAllByVille(@RequestParam(name = "club",value = "Paris") String club){
        return joueurService.fetchAllByClub(club);
    }

    @PostMapping("/")
    Joueurs addJoueur(@RequestParam(name = "nom") String nom,
                            @RequestParam(name = "club") String club,
                            @RequestParam(name = "pays") String pays,
                            @RequestParam(name = "age") Integer age,
                            @RequestParam(name = "long") Long longeur,
                            @RequestParam(name = "score") Long score){
        Joueurs joueurs = new Joueurs(nom,club,pays,age,longeur,score);
        return joueurService.ajoutJoueur(joueurs);
    }
}
