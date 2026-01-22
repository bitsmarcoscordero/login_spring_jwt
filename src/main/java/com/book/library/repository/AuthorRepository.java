package com.book.library.repository;

import com.book.library.domain.author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<author, Long> {
    
    /**
     * Busca un autor por nombre
     * @param name nombre del autor
     * @return Optional con el autor si existe
     */
    Optional<author> findByName(String name);
    
    /**
     * Busca autores cuyo nombre contiene el texto especificado
     * @param name texto a buscar en el nombre
     * @return lista de autores que coinciden
     */
    List<author> findByNameContaining(String name);
    
    /**
     * Busca autores cuya biografía contiene el texto especificado
     * @param biography texto a buscar en la biografía
     * @return lista de autores que coinciden
     */
    List<author> findByBiographyContaining(String biography);
}
