package com.java052023.repositories;

import com.java052023.dto.MovieDto;
import com.java052023.entities.movies;
import com.java052023.projection.MovieProjetction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<movies, Long> {
    @Query(nativeQuery = true, value = " select m.id,m.name,g.description from movies m" +
            " inner join genres g on m.id_genres= g.id " +
            " where g.description = :genrename")
    List<MovieProjetction> localizar1(String genrename);

    @Query(" select new com.java052023.dto.MovieDto(obj.id,obj.name) from movies obj" +
            " where obj.genre.description = :genrename")
    List<MovieDto> localizar2(String genrename);
}
