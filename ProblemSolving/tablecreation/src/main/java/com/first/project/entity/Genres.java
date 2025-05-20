package com.first.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Genres {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer genresId;

	private String genresName;

	public Integer getGenresId() {
		return genresId;
	}

	public void setGenresId(Integer genresId) {
		this.genresId = genresId;
	}

	public String getGenresName() {
		return genresName;
	}

	public void setGenresName(String genresName) {
		this.genresName = genresName;
	}

}
