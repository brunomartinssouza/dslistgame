package com.devsuperior.dslistgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslistgame.dto.GameDTO;
import com.devsuperior.dslistgame.dto.GameListDTO;
import com.devsuperior.dslistgame.services.GameListService;
import com.devsuperior.dslistgame.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService GameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return GameListService.findAll();
	}

}
