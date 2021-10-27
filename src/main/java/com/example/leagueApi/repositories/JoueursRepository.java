package com.example.leagueApi.repositories;

import com.example.leagueApi.model.Joueurs;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

public interface JoueursRepository extends MongoRepository<Joueurs, BigInteger> {

    List<Joueurs> findByPays(String pays);

    List<Joueurs> findByClub(String club);
}
