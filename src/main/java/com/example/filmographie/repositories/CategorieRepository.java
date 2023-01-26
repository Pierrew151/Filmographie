package com.example.filmographie.repositories;

import com.example.filmographie.bo.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
