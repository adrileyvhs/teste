package com.java052023.dto;

import com.java052023.projection.CustomerProjetction;
import com.java052023.projection.MovieProjetction;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MovieDto {
    private Long id;
    private String name;

public MovieDto(MovieProjetction movieProjetction) {
                    id = movieProjetction.getId();
                    name = movieProjetction.getName();
}
}