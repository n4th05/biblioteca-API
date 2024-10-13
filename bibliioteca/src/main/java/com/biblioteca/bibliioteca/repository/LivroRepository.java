package com.biblioteca.bibliioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.bibliioteca.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
