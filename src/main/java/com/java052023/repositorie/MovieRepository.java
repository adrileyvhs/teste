package com.java052023.repositorie;

import com.java052023.entities.customers;
import com.java052023.entities.movies;
import com.java052023.projection.CustomerProjetction;
import com.java052023.projection.MovieProjetction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<movies, Long> {

    @Query(nativeQuery = true,value =  " SELECT m.id,m.name,g.description FROM movies m  " +
                                       " INNER JOIN genres g  ON m.id_genres= g.id "+
                                       " where g.description = :genrename")

      List<MovieProjetction> localizar1(String genrename);
}
