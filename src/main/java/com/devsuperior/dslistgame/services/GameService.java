package com.devsuperior.dslistgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslistgame.dto.GameDTO;
import com.devsuperior.dslistgame.dto.GameMinDTO;
import com.devsuperior.dslistgame.dto.GameMinListDTO;
import com.devsuperior.dslistgame.entities.Game;
import com.devsuperior.dslistgame.projections.GameMinProjection;
import com.devsuperior.dslistgame.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> game = gameRepository.findAll();
		return game.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id){
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinListDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(GameMinListDTO::new).toList();
	}
	

}
