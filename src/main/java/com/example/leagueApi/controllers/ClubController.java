package com.example.leagueApi.controllers;


import com.example.leagueApi.model.Clubs;
import com.example.leagueApi.services.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
@AllArgsConstructor
public class ClubController {

    private final ClubService clubService;


    @GetMapping("/all")
    public List<Clubs> fetchAlClibs(){
        return clubService.getAllClubs();
    }
    @PostMapping("/create")
    public String addclub(@RequestBody Clubs clubs){
        return clubService.createClub(clubs);
    }
    @GetMapping("/all/pays/{pays}")
    public List<Clubs> fetchClubsByPays(@PathVariable String pays){
        return clubService.getClubByPays(pays);
    }
    @GetMapping("/all/villes/{ville}")
    public List<Clubs> fetchClubsByVille(@PathVariable String ville){
        return clubService.getClubByVille(ville);
    }
    @GetMapping("/all/{club}")
    public Clubs fetchClubsByclub(@PathVariable String club){
        return clubService.getClub(club);
    }
    @PostMapping("/update")
    public Clubs updateClubs(@RequestBody Clubs club){
        return clubService.updatelubs(club);
    }
    @DeleteMapping("/delete")
    public String deleteClubs(@RequestBody Clubs club){
        return clubService.deleteClubs(club);
    }
    @DeleteMapping("/delete/{nom}")
    public String deleteClubByNom(@PathVariable String nom){
        return clubService.deleteClubByNom(nom);
    }

    /**/
    @GetMapping("/all/couleurs/{color}")
    public List<Clubs> fetchClubsByColor(@PathVariable String color){
        //String[] couleur = {color};
        return clubService.getClubByColor(color);
    }

    @GetMapping("/all/capacite")
    public List<Clubs> fetchByMaxCap( @RequestParam(name = "maxCapacite", value = "1000") int capmax){
        return clubService.getLtCapacite(capmax);
    }
}
