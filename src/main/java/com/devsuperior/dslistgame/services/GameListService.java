package com.devsuperior.dslistgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslistgame.dto.GameListDTO;
import com.devsuperior.dslistgame.entities.GameList;
import com.devsuperior.dslistgame.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> gameList = gameListRepository.findAll();
		return gameList.stream().map(GameListDTO::new).toList();
	}
	
	
	

}
