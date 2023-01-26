package com.example.filmographie.repositories;

import com.example.filmographie.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
