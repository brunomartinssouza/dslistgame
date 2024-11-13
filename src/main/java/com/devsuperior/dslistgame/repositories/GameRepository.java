package com.devsuperior.dslistgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
