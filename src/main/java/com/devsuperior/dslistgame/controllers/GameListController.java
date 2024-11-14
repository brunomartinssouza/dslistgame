package com.devsuperior.dslistgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslistgame.dto.GameListDTO;
import com.devsuperior.dslistgame.dto.GameMinListDTO;
import com.devsuperior.dslistgame.services.GameListService;
import com.devsuperior.dslistgame.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService GameListService;
	
	@Autowired
	private GameService GameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return GameListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinListDTO> findByList(@PathVariable Long listId){
		return GameService.findByList(listId);
	}
	
	

}
