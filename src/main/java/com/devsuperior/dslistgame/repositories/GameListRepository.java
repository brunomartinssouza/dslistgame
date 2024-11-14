package com.devsuperior.dslistgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
