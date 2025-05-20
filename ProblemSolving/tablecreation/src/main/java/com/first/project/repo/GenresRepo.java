package com.first.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.project.entity.Genres;

public interface GenresRepo  extends JpaRepository<Genres, Integer>{

}
