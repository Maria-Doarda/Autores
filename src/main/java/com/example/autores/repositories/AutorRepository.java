package com.example.autores.repositories;

import com.example.autores.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
