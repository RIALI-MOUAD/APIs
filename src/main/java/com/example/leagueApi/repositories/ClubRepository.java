package com.example.leagueApi.repositories;

import com.example.leagueApi.model.Club;
import com.example.leagueApi.model.Clubs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.math.BigInteger;
import java.util.List;

public interface ClubRepository extends MongoRepository<Clubs, BigInteger> {

    @Query("{pays:?0}")
    List<Clubs> getByPays(String pays);
    @Query("{Ville:?0}")
    List<Clubs> getByVille(String ville);
    @Query("{nom:?0}")
    Clubs getByClub(String club);

    @Query(value="{'nom' : ?0}", delete = true)
    void delByNom(String nom);

    List<Clubs> findByCouleurs(String color);

    //@Query(value = "{ capacite : { $lt : ?0 } }")
    //List<Clubs> getltCapcite(Integer cap);


    List<Clubs> findByCapaciteLessThan(int capmax);

    /*@Query("{'couleurs':'?0'}")
    List<Clubs> getByColor(String color){
        return null;
    };*/





}
