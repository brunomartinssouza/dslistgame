package com.devsuperior.dslistgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslistgame.dto.GameDTO;
import com.devsuperior.dslistgame.dto.GameMinDTO;
import com.devsuperior.dslistgame.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService GameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return GameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		return GameService.findById(id);
	}
	

}
