package com.java052023.repositories;

import com.java052023.dto.CustomerDto;
import com.java052023.entities.customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ConstumerRepository extends JpaRepository<customers, Integer> {

//    @Query(nativeQuery = true,value =  " SELECT first_Name from  customers" +
//                                       " WHERE state= :state ")


    @Query(" SELECT new com.java052023.dto.CustomerDto(u.state) from  customers u")
            List<CustomerDto> localizar1();
}


//*
// @Repository
//public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
//
//    @Query("SELECT new com.example.dto.UsuarioDTO(u.nome, u.telefone, u.endereco.endereco) FROM Usuario u")
//    List<UsuarioDTO> findUsuariosWithEndereco();
//}*//

/*
*
    @Query(" select new com.java052023.dto.MovieDto(obj.id,obj.name) from movies obj" +
            " where obj.genre.description = :genrename")
    List<MovieDto> localizar2(String genrename);
* */