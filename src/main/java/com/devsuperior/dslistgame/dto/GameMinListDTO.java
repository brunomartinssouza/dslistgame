package com.devsuperior.dslistgame.dto;

import com.devsuperior.dslistgame.projections.GameMinProjection;

public class GameMinListDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	private Integer position;
	
	
	public Integer getPosition() {
		return position;
	}


	public GameMinListDTO() {
	}

	
	public GameMinListDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
		position = projection.getPosition();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
