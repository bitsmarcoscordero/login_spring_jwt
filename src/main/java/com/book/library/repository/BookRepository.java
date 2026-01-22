package com.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.library.domain.book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<book, Long> {
    
    /**
     * Busca libros por autor
     * @param author nombre del autor
     * @return lista de libros del autor
     */
    List<book> findByAuthor(String author);
    
    /**
     * Busca libros disponibles
     * @return lista de libros disponibles
     */
    List<book> findByAvailable(Boolean available);
    
    /**
     * Busca libros por año de publicación
     * @param publicationYear año de publicación
     * @return lista de libros del año especificado
     */
    List<book> findByPublicationYear(Integer publicationYear);
    
    /**
     * Busca un libro por descripción (búsqueda parcial)
     * @param description descripción
     * @return lista de libros que contienen la descripción
     */
    List<book> findByDescriptionContaining(String description);
}
