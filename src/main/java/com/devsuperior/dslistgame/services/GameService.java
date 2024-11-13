package com.devsuperior.dslistgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslistgame.dto.GameMinDTO;
import com.devsuperior.dslistgame.entities.Game;
import com.devsuperior.dslistgame.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> game = gameRepository.findAll();
		return game.stream().map(GameMinDTO::new).toList();
	}

}
